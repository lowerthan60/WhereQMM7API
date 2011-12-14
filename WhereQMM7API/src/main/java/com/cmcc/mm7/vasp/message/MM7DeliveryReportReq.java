/**File Name:MM7DeliveryReportReq.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-2-2
 * */

package com.cmcc.mm7.vasp.message;

import java.util.Date;

public class MM7DeliveryReportReq extends MM7RSReq
{
  private String MMSRelayServerID;
  private boolean MMSRelayServerIDExist;
  private String MessageID;
  private boolean MessageIDExist;
  private String RecipientAddress;
  private boolean RecipientAddressExist;
  private String SenderAddress;
  private boolean SenderAddressExist;
  private Date TimeStamp;
  private boolean TimeStampExist;
  private byte MMStatus;
  private boolean MMStatusExist;
  private String MMStatusText;
  private boolean MMStatusTextExist;

  public void setMMSRelayServerID (String mmscID)  //����MMSRelay/ServerRelay/Server�ı�ʶ��
  {
    MMSRelayServerID = mmscID;
    MMSRelayServerIDExist = true;
  }
  public String getMMSRelayServerID ()  //���MMSRelay/ServerRelay/Server�ı�ʶ��
  {
    return(MMSRelayServerID);
  }
  public boolean isMMSRelayServerIDExist()  //�Ƿ����MMSRelay/ServerRelay/Server�ı�ʶ��
  {
    return(MMSRelayServerIDExist);
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
  public void setRecipient(String address)  //���õ��ͱ�����ͨ����״̬��Ӧ�Ľ��շ���ַ
  {
    RecipientAddress = address;
    RecipientAddressExist = true;
  }
  public String getRecipient()  //��ȡ���ͱ�����ͨ����״̬��Ӧ�Ľ��շ���ַ
  {
    return(RecipientAddress);
  }
  public boolean isRecipientExist()  //�Ƿ���ڽ��շ���ַ
  {
    return(RecipientAddressExist);
  }
  public void setSender(String senderAddress)  //����MMʼ�����ĵ�ַ
  {
    SenderAddress = senderAddress;
    SenderAddressExist = true;
  }
  public String getSender()  //���MMʼ�����ĵ�ַ
  {
    return(SenderAddress);
  }
  public boolean isSenderExist()  //�Ƿ����MMʼ�����ĵ�ַ
  {
    return(SenderAddressExist);
  }
  public void setTimeStamp(Date timeStamp)  //�����ύMM��ʱ������ڣ�����ʱ�䣩
  {
    TimeStamp = timeStamp;
    TimeStampExist = true;
  }
  public Date getTimeStamp()  //����ύMM��ʱ�������
  {
    return(TimeStamp);
  }
  public boolean isTimeStampExist()  //�Ƿ�����ύMM��ʱ�������
  {
    return(TimeStampExist);
  }
  public void setMMStatus(byte mmStatus)  //����MmStatus
  {
    MMStatus = mmStatus;
    MMStatusExist = true;
  }
  public byte  getMMStatus()  //���MmStatus
  {
    return(MMStatus);
  }
  public boolean isMMStatusExist()  //�Ƿ����MmStatus
  {
    return(MMStatusExist);
  }
  public void setStatusText(String mmStatusText)  //����MMStatusText
  {
    MMStatusText = mmStatusText;
    MMStatusTextExist = true;
  }
  public String getStatusText()  //���StatusText
  {
    return(MMStatusText);
  }
  public boolean isStatusTextExist()  //�Ƿ����StatusText
  {
    return(MMStatusTextExist);
  }
  public String toString()  //���ض�����ı���ʾ
  {
    StringBuffer sb = new StringBuffer();
    sb.append("MMSRelayServerID=" + MMSRelayServerID+"\n");
    sb.append("MMSRelayServerIDExist=" + MMSRelayServerIDExist+"\n");
    sb.append("MessageID=" + MessageID+"\n");
    sb.append("MessageIDExist=" + MessageIDExist+"\n");
    sb.append("Recipient=" + RecipientAddress+"\n");
    sb.append("RecipientExist=" + RecipientAddressExist+"\n");
    sb.append("Sender=" + SenderAddress+"\n");
    sb.append("SenderExist=" + SenderAddressExist+"\n");
    sb.append("TimeStamp=" + TimeStamp+"\n");
    sb.append("TimeStampExist=" + TimeStampExist+"\n");
    sb.append("MMStatus=" + MMStatus+"\n");
    sb.append("MMStatusExist=" + MMStatusExist+"\n");
    sb.append("StatusText=" + MMStatusText+"\n");
    sb.append("StatusTextExist=" + MMStatusTextExist+"\n");
    return sb.toString();
  }
}