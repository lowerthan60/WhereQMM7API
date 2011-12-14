/**File Name:MM7CancelReq.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2003-12-30
 * */
package com.cmcc.mm7.vasp.message;



public class MM7CancelReq extends MM7VASPReq
{
  private String VASPID;
  private boolean VASPIDExist = false;
  private String VASID;
  private boolean VASIDExist = false;
  private String SenderAddress;
  private boolean SenderAddressExist = false;
  private String MessageID;
  private boolean MessageIDExist = false;

  public void setVASPID(String vaspID)  //����SP����
  {
    VASPID = vaspID;
    VASPIDExist = true;
  }
  public String getVASPID()  //���SP����
  {
    return(VASPID);
  }
  public boolean isVASPIDExist()  //�Ƿ����SP����
  {
    return(VASPIDExist);
  }
  public void setVASID(String vasID)  //���÷������
  {
    VASID = vasID;
    VASIDExist = true;
  }
  public String getVASID()  //��÷������
  {
    return(VASID);
  }
  public boolean isVASIDExist()  //�Ƿ���ڷ������
  {
    return(VASIDExist);
  }
  public void setSenderAddress(String senderAddress)  //����MMʼ�����ĵ�ַ
  {
    SenderAddress = senderAddress;
    SenderAddressExist = true;
  }
  public String getSenderAddress()  //���MMʼ�����ĵ�ַ
  {
    return(SenderAddress);
  }
  public boolean isSenderAddressExist()  //�Ƿ����MMʼ�����ĵ�ַ
  {
    return(SenderAddressExist);
  }
  public void setMessageID(String messageID)  //����messageID
  {
    MessageID = messageID;
    MessageIDExist = true;
  }
  public String getMessageID()  //���messageID
  {
    return(MessageID);
  }
  public boolean isMessageIDExist()  //�Ƿ����messageID
  {
    return(MessageIDExist);
  }
  public String toString()
  {
    StringBuffer sb = new StringBuffer();
    sb.append("VASPID=" + VASPID+"\n");
    sb.append("VASPIDExist=" + VASPIDExist+"\n");
    sb.append("VASID=" + VASID+"\n");
    sb.append("VASIDExist=" + VASIDExist+"\n");
    sb.append("SenderAddress=" + SenderAddress+"\n");
    sb.append("SenderAddressExist=" + SenderAddressExist+"\n");
    sb.append("MessageID=" + MessageID+"\n");
    sb.append("MessageIDExist=" + MessageIDExist+"\n");
    return sb.toString();
  }
}