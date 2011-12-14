package com.cmcc.mm7.vasp.common;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;

import com.cmcc.mm7.vasp.conf.MM7Config;
import com.cmcc.mm7.vasp.message.MM7SubmitReq;

public class MMContentTest extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for MMContent");
		// $JUnit-BEGIN$

		suite.addTest(new MMContentTest("testMMContent"));

		// $JUnit-END$
		return suite;
	}

	public MMContentTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	public void testMMContent() {
		MMContent content = new MMContent();
		content.setContentType(MMConstants.ContentType.WAP_MULTIPART_RELATED);
		content.setContentID("mm7Test");

		// Path where contents are stored assumed to be same as this class...
		String path = getPath();

		InputStream input = null;
		byte[] byteArray = null;
		// Add SMIL content
		byteArray = readFile(path + "HelloWorld.smil");
		input = new ByteArrayInputStream(byteArray);
		MMContent smil_part = MMContent.createFromStream(input);
		smil_part.setContentID("<0000>");
		smil_part.setContentType(MMConstants.ContentType.SMIL);
		content.addSubContent(smil_part);

		// Add slide1 text
		byteArray = readFile(path + "HelloWorld.txt");
		input = new ByteArrayInputStream(byteArray);
		MMContent s1_text = MMContent.createFromStream(input);
		s1_text.setContentType(MMConstants.ContentType.TEXT);
		s1_text.setContentID("<HelloWorld.txt>");
		s1_text.setContentLocation("HelloWorld.txt");
		content.addSubContent(s1_text);

		// Add slide1 image
		byteArray = readFile(path + "SmileyFace.gif");
		input = new ByteArrayInputStream(byteArray);
		MMContent s1_image = MMContent.createFromStream(input);
		s1_image.setContentType(MMConstants.ContentType.GIF);
		s1_image.setContentID("<SmileyFace.gif>");
		s1_image.setContentLocation("SmileyFace.gif");
		content.addSubContent(s1_image);

		// Add slide1 audio
		byteArray = readFile(path + "HelloWorld.amr");
		input = new ByteArrayInputStream(byteArray);
		MMContent s1_audio = MMContent.createFromStream(input);
		s1_audio.setContentType("audio/amr");
		s1_audio.setContentID("<HelloWorld.amr>");
		s1_audio.setContentLocation("HelloWorld.amr");
		content.addSubContent(s1_audio);

		// Add slide2 text
		byteArray = readFile(path + "TheEnd.txt");
		input = new ByteArrayInputStream(byteArray);
		MMContent s2_text = MMContent.createFromStream(input);
		s2_text.setContentType(MMConstants.ContentType.TEXT);
		s2_text.setContentID("<TheEnd.txt>");
		s2_text.setContentLocation("TheEnd.txt");
		content.addSubContent(s2_text);

		// Add slide2 image
		byteArray = readFile(path + "TheEnd.gif");
		input = new ByteArrayInputStream(byteArray);
		MMContent s2_image = MMContent.createFromStream(input);
		s2_image.setContentType(MMConstants.ContentType.GIF);
		s2_image.setContentID("<TheEnd.gif>");
		s2_image.setContentLocation("TheEnd.gif");
		content.addSubContent(s2_image);

		// Add slide2 audio
		byteArray = readFile(path + "YallComeBackNowYaHear.amr");
		input = new ByteArrayInputStream(byteArray);
		MMContent s2_audio = MMContent.createFromStream(input);
		s2_audio.setContentType("audio/amr");
		s2_audio.setContentID("<YallComeBackNowYaHear.amr>");
		s2_audio.setContentLocation("YallComeBackNowYaHear.amr");
		content.addSubContent(s2_audio);

		MM7SubmitReq submit = new MM7SubmitReq();
		submit.setTransactionID("1000000");
		submit.addTo("4168358767");
		submit.setContent(content);

		MM7Config mm7Config = new MM7Config();
		mm7Config.setCharSet("ISO-8859-1");
		SOAPEncoder encoder = new SOAPEncoder(mm7Config);
		encoder.setMessage(submit);
		try {
			encoder.encodeMessage();
		} catch (Exception e) {
			System.err.println(e);
		}
		byte[] contentByteArray = encoder.getMessage();

		createMmsFile(contentByteArray, "Sample.mms");

		String str = new String(contentByteArray);
		System.out.println(str);

	}

	private byte[] readFile(String filename) {
		int fileSize = 0;
		RandomAccessFile fileH = null;

		// Opens the file for reading.
		try {
			fileH = new RandomAccessFile(filename, "r");
			fileSize = (int) fileH.length();
		} catch (IOException ioErr) {
			System.err.println("Cannot find " + filename);
			System.err.println(ioErr);
			System.exit(200);
		}

		// allocates the buffer large enough to hold entire file
		byte[] buf = new byte[fileSize];

		// reads all bytes of file
		int i = 0;
		try {
			while (true) {
				try {
					buf[i++] = fileH.readByte();
				} catch (EOFException e) {
					break;
				}
			}
		} catch (IOException ioErr) {
			System.out.println("ERROR in reading of file" + filename);
		}

		return buf;
	}

	private String getPath() {
		return "test_collaterals/smil/";
	}

	public void createMmsFile(byte[] output, String filename) {
		try {
			String path = getPath();
			File f = new File(path + filename);
			FileOutputStream out = new FileOutputStream(f);

			out.write(output);
			out.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
