/**File Name:MMContants.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-1-31
 * */

package com.cmcc.mm7.vasp.common;

import com.cmcc.mm7.vasp.common.MMContentType;

public class MMConstants {

  public class MessageClass {
    public static final String PERSONAL = "Personal";
    public static final String ADVERTISEMENT = "Advertisement ";
    public static final String INFORMATIONAL = "Informational";
    public static final String AUTO = "Auto";
  }

  public class Priority {
    public static final byte LOW = 0;
    public static final byte NORMAL = 1;
    public static final byte HIGH = 2;
  }

  public class ChargedParty {
    public static final byte NONE = 0;
    public static final byte SENDER = 1;
    public static final byte RECEIVER = 2;
    public static final byte BOTH = 3;
    public static final byte THIRD_PARTY = 4;
  }

  public static class ContentType {
    public static final MMContentType TEXT = new MMContentType("text/plain").lock();
    public static final MMContentType XML = new MMContentType("text/xml").lock();
    public static final MMContentType SMIL = new MMContentType("application/smil").lock();
    public static final MMContentType AMR = new MMContentType("audio/amr").lock();
    public static final MMContentType MIDI = new MMContentType("audio/midi").lock();
    public static final MMContentType I_MELODY = new MMContentType("text/i-melody").lock();
    public static final MMContentType E_MELODY = new MMContentType("text/e-melody").lock();
    public static final MMContentType GIF = new MMContentType("image/gif").lock();
    public static final MMContentType JPEG = new MMContentType("image/jpeg").lock();
    public static final MMContentType WBMP = new MMContentType("image/vnd.wap.wbmp").lock();
    public static final MMContentType PNG = new MMContentType("image/png").lock();
    public static final MMContentType MULTIPART_RELATED = new MMContentType("multipart/related;start=<START>").lock();
    public static final MMContentType MULTIPART_MIXED = new MMContentType("multipart/mixed").lock();
    public static final MMContentType WAP_MULTIPART_MIXED = new MMContentType("application/vnd.wap.multipart.mixed").lock();
    public static final MMContentType WAP_MULTIPART_RELATED = new MMContentType("application/vnd.wap.multipart.related;start=<START>").lock();
  }

  public class Charset{
    public static final String US_ASCII = "US-ASCII";
    public static final String ISO8859_1 = "ISO-8859-1";
    public static final String ISO8859_2 = "ISO-8859-2";
    public static final String ISO10646_UCS_2 = "ISO-10646-UCS-2";
    public static final String UTF8 = "UTF-8";
    public static final String GBK = "GBK";
    public static final String GB2312 = "GB2312";
  }

  public class RequestStatus{
    public static final int SUCCESS = 1000;
    public static final int PARTIAL_SUCCESS = 1001;
    public static final int CLIENT_ERROR = 2000;
    public static final int OPERATION_RESTRICTED = 2001;
    public static final int ADDRESS_ERROR = 2002;
    public static final int ADDRESS_NOTFOUND = 2003;
    public static final int CONTENT_REFUSED = 2004;
    public static final int MESSAGEID_NOTFOUND = 2005;
    public static final int LINKEDID_NOTFOUND = 2006;
    public static final int MESSAGE_FORMAT_CORRUPT = 2007;
    public static final int SERVER_ERROR = 3000;
    public static final int NOT_POSSIBLE = 3001;
    public static final int MESSAGE_REJECTED = 3002;
    public static final int MULTIADDRESS_NOTSUPPORT = 3003;
    public static final int GENERAL_SERVICE_ERROR = 4000;
    public static final int IMPROPER_ID = 4001;
    public static final int UNSUPPORT_VERSION = 4002;
    public static final int UNSUPPORT_OPERATION = 4003;
    public static final int VALIDATION_ERROR = 4004;
    public static final int SERVICE_ERROR = 4005;
    public static final int SERVICE_UNAVAILABLE = 4006;
    public static final int SERVICE_DENIED = 4007;

    public static final String TEXT_SUCCESS = "�ɹ�";
    public static final String TEXT_PARTIAL_SUCCESS = "���ֳɹ�";
    public static final String TEXT_CLIENT_ERROR = "�ͻ�������";
    public static final String TEXT_OPERATION_RESTRICTED = "��������";
    public static final String TEXT_ADDRESS_ERROR = "��ַ����";
    public static final String TEXT_ADDRESS_NOTFOUND = "�Ҳ�����ַ";
    public static final String TEXT_CONTENT_REFUSED = "��ý�����ݱ��ܾ�";
    public static final String TEXT_MESSAGEID_NOTFOUND = "�Ҳ�����ϢID";
    public static final String TEXT_LINKEDID_NOTFOUND = "�Ҳ�������ID";
    public static final String TEXT_MESSAGE_FORMAT_CORRUPT = "��Ϣ��ʽ�ƻ�";
    public static final String TEXT_SERVER_ERROR = "����������";
    public static final String TEXT_NOT_POSSIBLE = "���ɽ���";
    public static final String TEXT_MESSAGE_REJECTED = "��Ϣ���ܾ�";
    public static final String TEXT_MULTIADDRESS_NOTSUPPORT = "��֧�ֶ����ַ";
    public static final String TEXT_GENERAL_SERVICE_ERROR = "һ��������";
    public static final String TEXT_IMPROPER_ID = "��ʶ����ȷ";
    public static final String TEXT_UNSUPPORT_VERSION = "�汾��֧��";
    public static final String TEXT_UNSUPPORT_OPERATION = "������֧��";
    public static final String TEXT_VALIDATION_ERROR = "��֤����";
    public static final String TEXT_SERVICE_ERROR = "�������";
    public static final String TEXT_SERVICE_UNAVAILABLE = "�޷��ṩ����";
    public static final String TEXT_SERVICE_DENIED = "���񱻾ܾ�";
  }

  public class  MMStatus{
    public static final int EXPIRED = 0;
    public static final int RETRIEVED = 1;
    public static final int SYSTEM_REJECT = 2;
    public static final int RECIPIENT_REJECT = 3;
    public static final int INDETERMINATE = 4;
    public static final int FORWARDED = 5;
    public static final String TEXT_EXPIRED = "����";
    public static final String TEXT_RETRIEVED = "����";
    public static final String TEXT_SYSTEM_REJECT = "ϵͳ�ܾ�";
    public static final String TEXT_RECIPIENT_REJECT = "�û��ܾ�";
    public static final String TEXT_INDETERMINATE = "δ֪";
    public static final String TEXT_FORWARDED = "ת��";
  }

  public class ReadStatus{
    public static final int READ = 0;
    public static final int DELETED = 1;
    public static final int INDETERMINATE = 2;
    public static final String TEXT_READ = "�Ѷ�ȡ";
    public static final String TEXT_DELETED = "δ����ɾ";
    public static final String TEXT_INDETERMINATE = "δ֪";
  }

  public static final int ARRAYLIMIT = 256;
  public static final String CONTENT_LENGTH = "content-length";
  public static final String CONTENT_TYPE = "content-type";  //Content-Type
  public static final String CHARSET = "charset";
  public static final String CONTENT_ID = "content-id";  //Content-ID
  public static final String BEGINXMLFLAG = "<?xml";
  public static final String ENDXMLFLAG = "env:Envelope>";
  public static final String BOUNDARY = "boundary";
  public static final String SUBMITREQ = "SubmitReq";
  public static final String CANCELREQ = "CancelReq";
  public static final String REPLACEREQ = "ReplaceReq";
  public static final String DELIVERREQ = "DeliverReq";
  public static final String DELIVERYREPORTREQ = "DeliveryReportReq";
  public static final String READREPLYREQ = "ReadReplyReq";
  public static final String STATUS = "Status";
  public static final String STATUSCODE = "StatusCode";
  public static final String STATUSTEXT = "StatusText";
  public static final String STATUSDETAIL = "Details";
  public static final String MESSAGEID = "MessageID";
  public static final String HTTP = "http://";
  public static final String CONNECTION = "connection";  //Connection
  public static final String AUTHENTICATION = "WWW-Authenticate";
  public static final String REALM = "realm";
  public static final String NONCE = "nonce";
  public static final String ALGORITHM = "algorithm";
  public static final String QOP = "qop";
  public static final String OPAQUE = "opaque";
  public static final String AUTHORIZATION = "Authorization";
  public static final String DIGEST = "Digest";
  public static final String BASIC = "Basic";
}