/**File Name:MM7DeliverReq.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-2-1
 * */

package com.cmcc.mm7.vasp.message;

import java.util.List;
import java.util.Date;
import java.util.*;
import com.cmcc.mm7.vasp.common.MMContent;

public class MM7DeliverReq extends MM7RSReq
{
  private String MMSRelayServerID;
  private boolean MMSRelayServerIDExist;
  private String LinkedID;
  private boolean LinkedIDExist;
  private String SenderAddress;
  private boolean SenderAddressExist;
  private List To = new ArrayList();
  private boolean ToExist;
  private List Cc = new ArrayList();
  private boolean CcExist;
  private List Bcc = new ArrayList();
  private boolean BccExist;
  private Date TimeStamp;
  private boolean TimeStampExist;
  private String ReplyChargingID;
  private boolean ReplyChargingIDExist;
  private byte Priority;
  private boolean PriorityExist;
  private String Subject;
  private boolean SubjectExist;
  private MMContent Content = new MMContent();
  private boolean ContentExist;

  public void setMMSRelayServerID(String mmscID)  //����MMSC�ı�ʶ��
  {
    MMSRelayServerID = mmscID;
    MMSRelayServerIDExist = true;
  }
  public String getMMSRelayServerID ()  //���MMSC�ı�ʶ��
  {
    return(MMSRelayServerID);
  }
  public boolean isMMSRelayServerIDExist()  //�Ƿ����MMSC�ı�ʶ��
  {
    return(MMSRelayServerIDExist);
  }
  public void setLinkedID(String linkedID)  //����linkedID
  {
    LinkedID = linkedID;
    LinkedIDExist = true;
  }
  public String getLinkedID()  //���linkedID
  {
    return(LinkedID);
  }
  public boolean isLinkedIDExist()  //�Ƿ����linkedID
  {
    return(LinkedIDExist);
  }
  public void setSender(String senderAddress)  //����MMʼ�����ĵ�ַ
  {
    SenderAddress = senderAddress;
    SenderAddressExist = true;
  }
  public String getSender()   //���MMʼ�����ĵ�ַ
  {
    return(SenderAddress);
  }
  public boolean isSenderExist()  //�Ƿ����MMʼ�����ĵ�ַ
  {
    return(SenderAddressExist);
  }
  public  void setTo(List addressList)  //�������ý��շ�MM�ĵ�ַ
  {
    To = addressList;
    ToExist = true;
  }
  public  void  addTo(String address)  //���ӵ�����ַ
  {
    To.add(address);
    ToExist = true;
  }
  public List getTo ()  //��ý��շ�MM�ĵ�ַ
  {
    return(To);
  }
  public boolean isToExist()  //�Ƿ���ڽ��շ�MM�ĵ�ַ
  {
    return(ToExist);
  }
  public  void setCc (List ccAddressList)  //���ó��ͷ�MM�ĵ�ַ
  {
    Cc = ccAddressList;
    CcExist = true;
  }
  public  void addCc (String ccAddress)  //���ӵ������͵�ַ
  {
    Cc.add(ccAddress);
    CcExist = true;
  }
  public List getCc()  //��ó��ͷ�MM�ĵ�ַ
  {
    return(Cc);
  }
  public boolean isCcExist()  //�Ƿ���ڳ��ͷ�MM�ĵ�ַ
  {
    return(CcExist);
  }
  public  void setBcc (List bccAddressList)  //�������ͷ�MM�ĵ�ַ
  {
    Bcc = bccAddressList;
    BccExist = true;
  }
  public  void addBcc (String bccAddress)  //���ӵ������͵�ַ
  {
    Bcc.add(bccAddress);
    BccExist = true;
  }
  public List getBcc()  //������ͷ�MM�ĵ�ַ
  {
    return(Bcc);
  }
  public boolean isBccExist()  //�Ƿ�������ͷ�MM�ĵ�ַ
  {
    return(BccExist);
  }
  public void setTimeStamp(Date timeStamp)  //�����ύMM��ʱ�������
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
  public void setReplyChargingID(String replyChargingID)  //����ReplyChargingID
  {
    ReplyChargingID = replyChargingID;
    ReplyChargingIDExist = true;
  }
  public String getReplyChargingID()  //���ReplyChargingID
  {
    return(ReplyChargingID);
  }
  public boolean isReplyChargingIDExist()   //�Ƿ����ReplyChargingID
  {
    return(ReplyChargingIDExist);
  }
  public void setPriority(byte priority)  //����Priority
  {
    Priority = priority;
    PriorityExist = true;
  }
  public byte getPriority()  //���Priority
  {
    return(Priority);
  }
  public boolean isPriorityExist()  //�Ƿ����Priority����Ϣ�����ȼ�����Ҫ�ԣ�
  {                                 //��0=������ȼ���1=������2=������
    return(PriorityExist);
  }
  public void setSubject(String subject)  //����subject
  {
    Subject = subject;
    SubjectExist = true;
  }
  public String getSubject()  //���subject
  {
    return(Subject);
  }
  public boolean isSubjectExist()  //�Ƿ����subject
  {
    return(SubjectExist);
  }
  public void setContent(MMContent ammContent)  //����MMContent
  {
    Content = ammContent;
    ContentExist = true;
  }
  public MMContent getContent()  //���MMContent
  {
    return(Content);
  }
  public boolean isContentExist()  //�Ƿ����MMContent
  {
    return(ContentExist);
  }
  public String toString()
  {
    StringBuffer sb = new StringBuffer();
    sb.append("MMSRelayServerID=" + MMSRelayServerID+"\n");
    sb.append("MMSRelayServerIDExist=" + MMSRelayServerIDExist+"\n");
    sb.append("LinkedID=" + LinkedID+"\n");
    sb.append("LinkedIDExist=" + LinkedIDExist+"\n");
    sb.append("SenderAddress=" + SenderAddress+"\n");
    sb.append("SenderAddressExist=" + SenderAddressExist+"\n");
    if(!To.isEmpty())
    {
      for(int i=0;i<To.size();i++)
        sb.append("To["+i+"]=" + To.get(i)+"\n");
    }
    sb.append("ToExist=" + ToExist+"\n");
    if(!Cc.isEmpty())
    {
      for(int i=0;i<Cc.size();i++)
        sb.append("Cc["+i+"]=" + Cc.get(i) + "\n");
    }
    sb.append("CcExist=" + CcExist+"\n");
    if(!Bcc.isEmpty())
    {
      for(int i=0;i<Bcc.size();i++)
        sb.append("Bcc["+i+"]=" + Bcc.get(i) + "\n");
    }
    sb.append("BccExist=" + BccExist+"\n");
    sb.append("TimeStamp=" + TimeStamp+"\n");
    sb.append("TimeStampExist=" + TimeStampExist+"\n");
    sb.append("ReplyChargingID=" + ReplyChargingID+"\n");
    sb.append("ReplyChargingIDExist=" + ReplyChargingIDExist+"\n");
    sb.append("Priority=" + Priority+"\n");
    sb.append("PriorityExist=" + PriorityExist+"\n");
    sb.append("Subject=" + Subject+"\n");
    sb.append("SubjectExist=" + SubjectExist+"\n");
    sb.append("Content=" + Content+"\n");
    sb.append("ContentExist=" + ContentExist+"\n");
    return sb.toString();
  }
}