/**File Name:MM7ReadReplyReq.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-2-2
 * */

package com.cmcc.mm7.vasp.message;

import java.util.Date;

public class MM7ReadReplyReq extends MM7RSReq
{
  private String MMSReplayServerID;
  private boolean MMSReplayServerIDExist;
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
  private String StatusText;
  private boolean StatusTextExist;

  public void setMMSRelayServerID (String mmscID)  //����MMSRelay/ServerRelay/Server�ı�ʶ��
  {
    MMSReplayServerID = mmscID;
    MMSReplayServerIDExist = true;
  }
  public String getMMSRelayServerID ()  //���MMSRelay/ServerRelay/Server�ı�ʶ��
  {
    return(MMSReplayServerID);
  }
  public boolean isMMSRelayServerID ()  //�Ƿ����MMSRelay/ServerRelay/Server�ı�ʶ��
  {
    return(MMSReplayServerIDExist);
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
  public void setRecipient(String address)  //���ö���ظ�ͨ����״̬��Ӧ�Ľ��շ���ַ
  {
    RecipientAddress = address;
    RecipientAddressExist = true;
  }
  public String getRecipient()  //��ȡ����ظ���ͨ����״̬��Ӧ�Ľ��շ���ַ
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
  public void setTimeStamp(Date timeStamp)  //�����ύMM��ʱ�������
  {
    TimeStamp = timeStamp;
    TimeStampExist = true;
  }
  public Date getTimeStamp ()  //����ύMM��ʱ�������
  {
    return(TimeStamp);
  }
  public boolean isTimeStampExist()  //�Ƿ�����ύMM��ʱ�������
  {
    return(TimeStampExist);
  }
  public void setMMStatus(byte readStatus)  //����MMStatus
  {
    MMStatus = readStatus;
    MMStatusExist = true;
  }
  public byte getMMStatus()  //���MMStatus
  {
    return(MMStatus);
  }
  public boolean isMMStatusExist()  //�Ƿ����MMStatus
  {
    return(MMStatusExist);
  }
  public void setStatusText (String readStatusText)  //����StatusText
  {
    StatusText = readStatusText;
    StatusTextExist = true;
  }
  public String getStatusText()  //���StatusText
  {
    return(StatusText);
  }
  public boolean isStatusTextExist()  //�Ƿ����StatusText
  {
    return(StatusTextExist);
  }
  public String toString()  //���ض�����ı���ʾ
  {
    StringBuffer sb = new StringBuffer();
    sb.append("MMSReplayServerID=" + MMSReplayServerID+"\n");
    sb.append("MMSReplayServerIDExist=" + MMSReplayServerIDExist+"\n");
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
    sb.append("StatusText=" + StatusText+"\n");
    sb.append("StatusTextExist=" + StatusTextExist+"\n");
    return sb.toString();
  }
}