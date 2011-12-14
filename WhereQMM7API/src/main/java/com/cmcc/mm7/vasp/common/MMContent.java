/**File Name:MMContent.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-1-30
 * */

package com.cmcc.mm7.vasp.common;

import java.io.*;
import java.util.*;

public class MMContent implements Serializable, Cloneable
{
  private MMContentType ContentType;
  private String ContentID;
  private String ContentLocation;
  private MMContent PresentionContent;
  private String Charset;
  private boolean ContentIDExist;
  private boolean ContentLocationExist;
  private boolean PresentionContentExist;
  public List SubContents = new ArrayList();
  private boolean Multipart;
  private ByteArrayOutputStream byteOutput;

  /**
   * ���췽��
   * */
  public MMContent()
  {
    ContentType = new MMContentType();
    ContentID = "";
    ContentLocation = "";
    Charset = "UTF-8";
    ContentIDExist = false;
    ContentLocationExist = false;
    PresentionContentExist = false;
    //SubContents = new ArrayList();
    Multipart = false;
    byteOutput = new ByteArrayOutputStream();
  }
  /**
   * �ù��췽����Ϊ�˼���create�����������ġ��ⲿ�����ܵ��á�����������private��
   * */
  private MMContent(byte[] content)
  {
    byteOutput = new ByteArrayOutputStream();
    try{
      byteOutput.write(content);
    }catch(IOException e){
      System.err.println(e);
    }
  }
  /**
   * ��ô�MMContentǶ�׵���MMContent��List
   * */
  public List getSubContents()
  {
    return(SubContents);
  }
  /**
   * �Ƿ����Ƕ��ý��
   * */
  public boolean isMultipart()
  {
    return(Multipart);
  }
  /**
   * �����������
   * */
  public MMContentType getContentType()
  {
    return(ContentType);
  }
  /**
   * ������������
   * */
  public void setContentType(MMContentType contentType)
  {
    ContentType = contentType;
  }

  //////////////
  public void setContentType(String type)
  {
    MMContentType conType = new MMContentType(type);
    ContentType = conType;
  }

  /////////////////////

  /**
   * ���ContentID
   * */
  public String getContentID()
  {
    return(ContentID);
  }
  /**
   * ����ContentID
   * */
  public void setContentID(String contentID)
  {
    ContentID = contentID;
    ContentIDExist = true;
  }
  /**
   * �Ƿ����ContentID
   * */
  public boolean isContentIDExist()
  {
    return(ContentIDExist);
  }
  /**
   * ���ContentLocation
   * */
  public String getContentLocation()
  {
    return(ContentLocation);
  }
  /**
   * ����ContentLocation
   * */
  public void setContentLocation(String contentLocation)
  {
    ContentLocation = contentLocation;
    ContentLocationExist = true;
  }
  /**
   * �Ƿ����ContentLocation
   * */
  public boolean isContentLocationExist()
  {
    return(ContentLocationExist);
  }
  /**
   * ���Presentation���ݵ�����
   * */
  public MMContent getPresentionContent()
  {
    return(PresentionContent);
  }
  /**
   * ����MMContentΪPresentation����
   * */
  public void setPresentionContent(MMContent presentionContent)
  {
    PresentionContent = presentionContent;
    PresentionContentExist = true;
  }
  /**
   * �Ƿ����Presentation����
   * */
  public boolean isPresentionContentExist()
  {
    return(PresentionContentExist);
  }
  /**
   * ���뵥��MMContent��MMContent��List��
   * */
  public void addSubContent(MMContent content)
  {
     SubContents.add(content);
     Multipart = true;
  }
  /**
   * �Զ����Ʒ�ʽ���MMContent������
   * */
  public byte[] getContent()
  {
    return(byteOutput.toByteArray());
  }
  /**
   * ��String��ʽ���MMContent������
   * */
  public String getContentAsString()
  {
    String charset = getCharset();
    if(charset == null || charset.equals(""))
      charset = "UTF-8";
    try{
      return (byteOutput.toString(charset));
      //return (byteOutput.toString());
    }catch(IOException ioe){
      System.err.println(ioe);
      return null;
    }
  }
  /**
   * ͨ��ContentID���MMContent���͵�subContent
   * */
  public MMContent getSubContentByID(String contentID)
  {
    List subcontents = new ArrayList();
    subcontents = SubContents;
    MMContent subContent = new MMContent();
    for(int i=0;i<subcontents.size();i++)
    {
      MMContent subcontent = (MMContent)subcontents.get(i);
      if(subcontent.isContentIDExist())
      {
        if (contentID.equals(subcontent.getContentID())) {
          subContent = subcontent;
          break;
        }
      }
    }
    return(subContent);
  }
  /**
   * ͨ��ContentLocation���MMContent���͵�subContent
   * */
  public MMContent getSubContentByLocation(String contentLocation)
  {
    List subcontents = new ArrayList();
    subcontents = SubContents;
    MMContent subContent = new MMContent();
    for(int i=0;i<subcontents.size();i++)
    {
      MMContent subcontent = (MMContent)subcontents.get(i);
      if(subcontent.isContentLocationExist())
      {
        if (contentLocation.equals(subcontent.getContentLocation())) {
          subContent = subcontent;
          break;
        }
      }
    }
    return(subContent);
  }
  /**
   * ����ý�����ݵĴ�С
   * */
  public int getSize()
  {
    return(byteOutput.toByteArray().length);
  }
  /**
   * ����ı�ý�����ݵ��ַ���
   * */
  public String getCharset()
  {
    return(Charset);
  }
  /**
   * �����ı�ý�����ݵ��ַ���
   * */
  public void setCharset(String charset)
  {
    Charset = charset;
  }
  /**
   * ͨ������String ���ͽ���MMContent
   * */
  public static MMContent createFromString(String content)
  {
    MMContent mmContent = new MMContent(content.getBytes());
    return(mmContent);
  }
  /**
   * ͨ������InputStream���ͽ���MMContent
   * */
  public static MMContent createFromStream(InputStream in)
  {
    DataInputStream input = new DataInputStream(in);
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    byte[] data = null;
    try{
      while (input.available() != 0) {
        output.write(input.readByte());
      }
      data = output.toByteArray();
    }catch(IOException ioe){
      System.err.println(ioe);
    }
    MMContent mmContent = new MMContent(data);
    return(mmContent);
  }
  /*
   *ͨ������InputStream���ͺ�length����MMContent
   */
  public static MMContent createFromStream(InputStream in, int length)
  {
    DataInputStream input = new DataInputStream(in);
    ByteArrayOutputStream byteout = new ByteArrayOutputStream();
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    byte[] data = null;
    try{
      while (input.available() != 0) {
        byteout.write(input.readByte());
      }
      data = byteout.toByteArray();
      output.write(data,0,length);
    }catch(IOException ioe){
      System.err.println(ioe);
    }
    data = output.toByteArray();
    MMContent mmContent = new MMContent(data);
    return(mmContent);
  }
  /**
   * ͨ������byte[]���ͽ���MMContent
   * */
  public static MMContent createFromBytes(byte[] data)
  {
    MMContent mmContent = new MMContent(data);
    return(mmContent);
  }
  /**
   * ͨ�������ļ��ľ���·������MMContent
   * */
  public static MMContent createFromFile(String filename)
  {
    try{
      DataInputStream input = new DataInputStream(new FileInputStream(filename));
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      byte[] data = null;
      while (input.available() != 0) {
        output.write(input.readByte());
      }
      data = output.toByteArray();
      MMContent mmContent = new MMContent(data);
      return (mmContent);
    }catch(IOException ioe){
      System.err.println(ioe);
      return null;
    }
  }
  /**
   * ���ض�����ı���ʾ
   * */
  public String toString()
  {
    StringBuffer sb = new StringBuffer();
    sb.append("ContentType=" + ContentType+"\n");
    sb.append("ContentID=" + ContentID+"\n");
    sb.append("ContentLocation=" + ContentLocation+"\n");
    sb.append("PresentionContent=" + PresentionContent+"\n");
    sb.append("Charset=" + Charset+"\n");
    sb.append("ContentIDExist=" + ContentIDExist+"\n");
    sb.append("ContentLocationExist=" + ContentLocationExist+"\n");
    sb.append("PresentionContentExist=" + PresentionContentExist+"\n");
    if(!SubContents.isEmpty())
    {
      for(int i=0;i<SubContents.size();i++)
        sb.append("SubContents["+i+"]=" + SubContents.get(i) + "\n");
    }
    sb.append("Multipart=" + Multipart+"\n");
    sb.append("byteOutput=" + byteOutput+"\n");
    return sb.toString();
  }
}