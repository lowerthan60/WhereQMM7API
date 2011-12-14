/**File Name:MM7SubmitReq.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-2-2
 * */

package com.cmcc.mm7.vasp.message;

import java.util.List;
import java.util.Date;
import java.util.*;
import com.cmcc.mm7.vasp.common.MMContent;

public class MM7SubmitReq extends MM7VASPReq
{
  private String VASPID;
  private String VASID;
  private String ServiceCode;
  private String SenderAddress;
  private List To = new ArrayList();
  private List Cc = new ArrayList();
  private List Bcc = new ArrayList();
  private String LinkedID;
  private String MessageClass;
  private Date TimeStamp;
  private Date ExpiryDate;
  private long ExpiryDateDuration;
  private Date EarliestDeliveryTime;
  private long EarliestTimeDuration;
  private boolean DeliveryReport;
  private boolean ReadReply;
  private boolean ReplyCharging;
  private Date ReplyDeadline;
  private long ReplyDeadlineDuration;
  private int ReplyChargingSize;
  private byte Priority;
  private String Subject;
  private boolean AllowAdaptations=true;
  private byte ChargedParty;
  private String ChargedPartyID;
  private MMContent Content = new MMContent();
  private boolean DistributionIndicator;
  private boolean VASPIDExist;
  private boolean VASIDExist;
  private boolean ServiceCodeExist;
  private boolean SenderAddressExist;
  private boolean ToExist;
  private boolean CcExist;
  private boolean BccExist;
  private boolean LinkedIDExist;
  private boolean MessageClassExist;
  private boolean TimeStampExist;
  private boolean ExpiryDateExist;
  private boolean ExpiryDateAbsoluteExist;
  private boolean EarliestDeliveryTimeExist;
  private boolean EarliestDeliveryTimeAbsoluteExist;
  private boolean DeliveryReportExist;
  private boolean ReadReplyExist;
  private boolean ReplyChargingExist;
  private boolean ReplyDeadlineExist;
  private boolean ReplyDeadlineAbsoluteExist;
  private boolean ReplyChargingSizeExist;
  private boolean PriorityExist;
  private boolean SubjectExist ;
  private boolean AllowAdaptationsExist=true;
  private boolean ChargedPartyExist;
  private boolean ChargedPartyIDExist;
  private boolean ContentExist;
  private boolean DistributionIndicatorExist;

 /* public MM7SubmitReq()
  {
    To = new ArrayList();
    Cc = new ArrayList();
    Bcc = new ArrayList();
    DeliveryReport = false;
    ReadReply = false;
    ReplyCharging = false;
    Priority = 0;
    AllowAdaptations = false;
    ChargedParty = 0;*/
    //Content = new MMContent();
    /*DistributionIndicator = false;
    VASPIDExist = false;
    VASIDExist = false;
    ServiceCodeExist  = false;
    SenderAddressExist  = false;
    ToExist = false;
    CcExist = false;
    BccExist = false;
    LinkedIDExist = false;
    MessageClassExist = false;
    TimeStampExist = false;
    ExpiryDateExist = false;
    ExpiryDateAbsoluteExist = false;
    EarliestDeliveryTimeExist = false;
    EarliestDeliveryTimeAbsoluteExist = false;
    DeliveryReportExist = false;
    ReadReplyExist = false;
    ReplyChargingExist = false;
    ReplyDeadlineExist = false;
    ReplyDeadlineAbsoluteExist = false;
    ReplyChargingSizeExist = false;
    PriorityExist = false;
    SubjectExist = false;
    AllowAdaptationsExist = false;
    ChargedPartyExist = false;
    FeeTerminalIDExist = false;
    Content = new MMContent();
    ContentExist = false;
    DistributionIndicatorExist = false;*/
  //}

  public void setVASPID(String vaspid)  //����SP����
  {
    this.VASPID = vaspid;
    VASPIDExist = true;
  }
  public String getVASPID()  //���SP����
  {
    return(this.VASPID);
  }
  public boolean isVASPIDExist()  //�Ƿ����SP����
  {
    return(VASPIDExist);
  }
  public void setVASID(String vasid)  //���÷������
  {
    this.VASID = vasid;
    VASIDExist = true;
  }
  public String getVASID()  //��÷������
  {
    return(this.VASID);
  }
  public boolean isVASIDExist()  //�Ƿ���ڷ������
  {
    return(VASIDExist);
  }
  public void setServiceCode(String servicecode)  //����ҵ�����
  {
    this.ServiceCode = servicecode;
    ServiceCodeExist = true;
  }
  public String getServiceCode()  //���ҵ�����
  {
    return(this.ServiceCode);
  }
  public boolean isServiceCodeExist()  //�Ƿ����ҵ�����
  {
    return(ServiceCodeExist);
  }
  public void setSenderAddress(String senderAddress)  //����MMʼ�����ĵ�ַ
  {
    this.SenderAddress = senderAddress;
    SenderAddressExist = true;
  }
  public String getSenderAddress()  //���MMʼ�����ĵ�ַ
  {
    return(this.SenderAddress);
  }
  public boolean isSenderAddressExist()  //�Ƿ����MMʼ�����ĵ�ַ
  {
    return(SenderAddressExist);
  }
  public  void setTo(List addressList)  //�������ý��շ�MM�ĵ�ַ
  {
    this.To = addressList;
    ToExist = true;
  }
  public  void  addTo(String address)  //���ӵ�����ַ
  {
    To.add(address);
    ToExist = true;
  }
  public List getTo ()  //��ý��շ�MM�ĵ�ַ
  {
    return(this.To);
  }
  public boolean isToExist()  //�Ƿ���ڽ��շ�MM�ĵ�ַ
  {
    return(ToExist);
  }
  public  void setCc (List ccAddressList)  //���ó��ͷ�MM�ĵ�ַ
  {
    this.Cc = ccAddressList;
    CcExist = true;
  }
  public  void addCc (String ccAddress)  //���ӵ������͵�ַ
  {
    Cc.add(ccAddress);
    CcExist = true;
  }
  public List getCc()  //��ó��ͷ�MM�ĵ�ַ
  {
    return(this.Cc);
  }
  public boolean isCcExist()  //�Ƿ���ڳ��ͷ�MM�ĵ�ַ
  {
    return(CcExist);
  }

  public  void setBcc (List bccAddressList)  //�������ͷ�MM�ĵ�ַ
  {
    this.Bcc = bccAddressList;
    BccExist = true;
  }
  public  void addBcc (String bccAddress)  //���ӵ������͵�ַ
  {
    Bcc.add(bccAddress);
    BccExist = true;
  }
  public List getBcc()  //������ͷ�MM�ĵ�ַ
  {
    return(this.Bcc);
  }
  public boolean isBccExist()  //�Ƿ�������ͷ�MM�ĵ�ַ
  {
    return(BccExist);
  }
  public void setLinkedID(String linkedID)  //�������ӱ�ʶ
  {
    this.LinkedID = linkedID;
    LinkedIDExist = true;
  }
  public String getLinkedID()   //������ӱ�ʶ
  {
    return(this.LinkedID);
  }
  public boolean isLinkedIDExist()  //�Ƿ�������ӱ�ʶ
  {
    return(LinkedIDExist);
  }
  public void setMessageClass(String messageclass)  //����MM�����
  {
    this.MessageClass = messageclass;
    MessageClassExist = true;
  }
  public String getMessageClass()  //���MM�����
  {
    return(this.MessageClass);
  }
  public boolean isMessageClassExist()  //�Ƿ����MM�����
  {
    return(MessageClassExist);
  }
  public void setTimeStamp(Date timeStamp)  //�����ύMM��ʱ�������
  {
    this.TimeStamp = timeStamp;
    TimeStampExist = true;
  }
  public Date getTimeStamp()  //����ύMM��ʱ�������
  {
    return(this.TimeStamp);
  }
  public boolean isTimeStampExist()  //�Ƿ�����ύMM��ʱ�������
  {
    return(TimeStampExist);
  }
  public void setExpiryDate(Date expiryDate)  //����MM��ָ����ʱʱ�䣨����ʱ�䣩
  {
    this.ExpiryDate = expiryDate;
    ExpiryDateAbsoluteExist = true;
  }
  public void setExpiryDate(long duration)  //duration�ṩ���ʱ�䣬����Ϊ��λ
  {
    this.ExpiryDateDuration = duration;
    ExpiryDateExist = true;
  }
  public long getExpiryDateRelative()  //���MM��ָ����ʱʱ��
  {
    return(this.ExpiryDateDuration);
  }
  public Date getExpiryDateAbsolute()
  {
    return(this.ExpiryDate);
  }
  public boolean isExpiryDateExist()  //�Ƿ����MM��ָ����ʱʱ��
  {
    return(ExpiryDateExist);
  }
  public boolean isExpiryDateAbsolute()  //�Ƿ����ʱ���ʽ
  {
    return(ExpiryDateAbsoluteExist);
  }
  public void setEarliestDeliveryTime(Date time)  //���ý�MM���͸����շ�����������ʱ�䣨����ʱ�䣩
  {
    this.EarliestDeliveryTime = time;
    EarliestDeliveryTimeAbsoluteExist = true;
  }
  public void setEarliestDeliveryTime(long duration)  //duration�ṩ���ʱ�䣬����Ϊ��λ
  {
    this.EarliestTimeDuration = duration;
    EarliestDeliveryTimeExist = true;
  }
  public long getEarliestDeliveryTimeRelative()  //��ý�MM���͸����շ��������������ʱ��
  {
    return(this.EarliestTimeDuration);
  }
  public Date getEarliestDeliveryTimeAbsolute()  //��ý�MM���͸����շ��������������ʱ��
  {
    return(this.EarliestDeliveryTime);
  }
  public boolean isEarliestDeliveryTimeExist()  //�Ƿ���ڽ�MM���͸����շ�����������ʱ�䡣
  {
    return(EarliestDeliveryTimeExist);
  }
  public boolean isEarliestDeliveryTimeAbsolute()  //�Ƿ����ʱ���ʽ
  {
    return(EarliestDeliveryTimeAbsoluteExist);
  }
  public void setDeliveryReport(boolean deliveryreport)  //�����Ƿ���Ҫ���ͱ��������
  {
    this.DeliveryReport = deliveryreport;
    DeliveryReportExist = true;
  }
  public boolean getDeliveryReport()  //����Ƿ���Ҫ���ͱ��������
  {
    return(this.DeliveryReport);
  }
  public boolean isDeliveryReportExist()  //�Ƿ�����Ƿ���Ҫ���ͱ��������
  {
    return(DeliveryReportExist);
  }
  public void setReadReply(boolean readreply)  //�����Ƿ���Ҫ��ȡ����
  {
    this.ReadReply = readreply;
    ReadReplyExist = true;
  }
  public boolean getReadReply()  //����Ƿ���Ҫ��ȡ����
  {
    return(this.ReadReply);
  }
  public boolean isReadReplyExist()  //�Ƿ�����Ƿ���Ҫ��ȡ����
  {
    return(ReadReplyExist);
  }
  public void setReplyCharging(boolean replyCharging)  //����Ӧ��Ʒѵ�����
  {
    this.ReplyCharging = replyCharging;
    ReplyChargingExist = true;
  }
  public boolean getReplyCharging()  //���Ӧ��Ʒѵ�����
  {
    return(this.ReplyCharging);
  }
  public boolean isReplyChargingExist()  //�Ƿ����Ӧ��Ʒѵ�����
  {
    return(ReplyChargingExist);
  }
  public void setReplyDeadline(Date replyDeadline)  //����ReplyChargingDeadline������ʱ�䣩
  {
    this.ReplyDeadline = replyDeadline;
    ReplyDeadlineAbsoluteExist = true;
  }
  public void setReplyDeadline(long duration)  //duration�ṩ���ʱ�� ������Ϊ��λ
  {
    this.ReplyDeadlineDuration = duration;
    ReplyDeadlineExist = true;
  }
  public long getReplyDeadlineRelative()  //���ReplyChargingDeadline
  {
    return(this.ReplyDeadlineDuration);
  }
  public Date getReplyDeadlineAbsolute()
  {
    return(this.ReplyDeadline);
  }
  public boolean isReplyDeadlineExist()  //�Ƿ����ReplyChargingDeadline
  {
    return(ReplyDeadlineExist);
  }
  public boolean isReplyDeadlineAbsoluteExist()  //�Ƿ����ʱ���ʽ
  {
    return(ReplyDeadlineAbsoluteExist);
  }
  public void setReplyChargingSize(int replyChargingSize)  //����ReplyChargingSize
  {
    this.ReplyChargingSize = replyChargingSize;
    ReplyChargingSizeExist = true;
  }
  public int getReplyChargingSize()  //���ReplyChargingSize
  {
    return(this.ReplyChargingSize);
  }
  public boolean isReplyChargingSizeExist()  //�Ƿ����ReplyChargingSize
  {
    return(ReplyChargingSizeExist);
  }
  public void setPriority(byte priority)  //����Priority
  {
    this.Priority = priority;
    PriorityExist = true;
  }
  public byte getPriority()  //���Priority
  {
    return(this.Priority);
  }
  public boolean isPriorityExist()  //�Ƿ����Priority����Ϣ�����ȼ�����Ҫ�ԣ�
  {                                 //��0=������ȼ���1=������2=������
    return(PriorityExist);
  }
  public void setSubject(String subject)  //����subject
  {
    this.Subject = subject;
    SubjectExist = true;
  }
  public String getSubject()  //���subject
  {
    return(this.Subject);
  }
  public boolean isSubjectExist()  //�Ƿ����subject
  {
    return(SubjectExist);
  }
  public void setAllowAdaptations(boolean allowAdaptations)  //����allowAdaptations
  {
    this.AllowAdaptations = allowAdaptations;
    AllowAdaptationsExist = true;
  }
  public boolean getAllowAdaptations()  //���allowAdaptations
  {
    return(this.AllowAdaptations);
  }
  public boolean isAllowAdaptationsExist()  //�Ƿ����allowAdaptations
  {
    return(AllowAdaptationsExist);
  }
  public void setChargedParty(byte chargedParty)  //����chargedParty
  {
    this.ChargedParty = chargedParty;
    ChargedPartyExist = true;
  }
  public byte getChargedParty()  //���chargedParty
  {
    return(this.ChargedParty);
  }
  public boolean isChargedPartyExist()  //�Ƿ����chargedParty,
  {                                     //ָ��VASP���ύMM�ĸ��ѷ������磬���ͷ�(0)�����շ�(1)��
    return(ChargedPartyExist);                       //���ͷ��ͽ��շ�(2)��������������(3)
  }
/*  public void setFeeTerminalID(String feeTerminalID)  //����feeTerminalID
  {
    this.FeeTerminalID = feeTerminalID;
    FeeTerminalIDExist = true;
  }
  public String getFeeTerminalID()  //���feeTerminalID
  {
    return(this.FeeTerminalID);
  }
  public boolean isFeeTerminalIDExist()  //�Ƿ����feeTerminalID
  {                                      //�ڸ��ѷ��Ȳ��Ƿ��ͷ���Ҳ���ǽ��շ�������£�
    return(FeeTerminalIDExist);                        //��Ҫʹ�ø��ֶα�ʶ���ѷ���E.164����
  }*/
  public void setChargedPartyID(String chargedPartyID)  //����feeTerminalID
  {
    this.ChargedPartyID = chargedPartyID;
    ChargedPartyIDExist = true;
  }
  public String getChargedPartyID()  //���feeTerminalID
  {
    return(this.ChargedPartyID);
  }
  public boolean isChargedPartyIDExist()  //�Ƿ����feeTerminalID
  {                                      //�ڸ��ѷ��Ȳ��Ƿ��ͷ���Ҳ���ǽ��շ�������£�
    return(ChargedPartyIDExist);                        //��Ҫʹ�ø��ֶα�ʶ���ѷ���E.164����
  }
  public void setContent(MMContent ammContent)  //����MMContent
  {
    this.Content = ammContent;
    ContentExist = true;
  }
  public MMContent getContent()  //���MMContent
  {
    return(this.Content);
  }
  public boolean isContentExist()  //�Ƿ����MMContent
  {
    return(ContentExist);
  }
  public void setDistributionIndicator (boolean MDI)  //����DistributionIndicator
  {
    this.DistributionIndicator = MDI;
    DistributionIndicatorExist = true;
  }
  public boolean getDistributionIndicator()  //���DistributionIndicator
  {
    return(this.DistributionIndicator);
  }
  public boolean isDistributionIndicatorExist()  //�Ƿ����DistributionIndicator
  {
    return(DistributionIndicatorExist);
  }
  //���ض�����ı���ʾ
  public String toString()
  {
    StringBuffer sb = new StringBuffer();
    sb.append("VASPID=" + VASPID+"\n");
    sb.append("VASID=" + VASID+"\n");
    sb.append("ServiceCode=" + ServiceCode+"\n");
    sb.append("SenderAddress=" + SenderAddress+"\n");
    if(!To.isEmpty())
    {
      for(int i=0;i<To.size();i++)
        sb.append("To["+i+"]=" + To.get(i) + "\n");
    }
    if(!Cc.isEmpty())
    {
      for(int i=0;i<Cc.size();i++)
        sb.append("Cc["+i+"]=" + Cc.get(i) + "\n");
    }
    if(!Bcc.isEmpty())
    {
      for(int i=0;i<Bcc.size();i++)
        sb.append("Bcc["+i+"]=" + Bcc.get(i) + "\n");
    }
    sb.append("LinkedID=" + LinkedID+"\n");
    sb.append("MessageClass=" + MessageClass+"\n");
    sb.append("TimeStamp=" + TimeStamp+"\n");
    sb.append("ExpiryDate=" + ExpiryDate+"\n");
    sb.append("ExpiryDateDuration=" + ExpiryDateDuration+"\n");
    sb.append("EarliestDeliveryTime=" + EarliestDeliveryTime+"\n");
    sb.append("EarliestTimeDuration=" + EarliestTimeDuration+"\n");
    sb.append("DeliveryReport=" + DeliveryReport+"\n");
    sb.append("ReadReply=" + ReadReply+"\n");
    sb.append("ReplyCharging=" + ReplyCharging+"\n");
    sb.append("ReplyDeadline=" + ReplyDeadline+"\n");
    sb.append("ReplyDeadlineDuration=" + ReplyDeadlineDuration+"\n");
    sb.append("ReplyChargingSize=" + ReplyChargingSize+"\n");
    sb.append("Priority=" + Priority+"\n");
    sb.append("Subject=" + Subject+"\n");
    sb.append("AllowAdaptations=" + AllowAdaptations+"\n");
    sb.append("ChargedParty=" + ChargedParty+"\n");
    sb.append("ChargedPartyID=" + ChargedPartyID + "\n");
    sb.append("Content=" + Content+"\n");
    sb.append("DistributionIndicator=" + DistributionIndicator+"\n");
    sb.append("VASPIDExist=" + VASPIDExist+"\n");
    sb.append("VASIDExist=" + VASIDExist+"\n");
    sb.append("ServiceCodeExist=" + ServiceCodeExist+"\n");
    sb.append("SenderAddressExist=" + SenderAddressExist+"\n");
    sb.append("ToExist=" + ToExist+"\n");
    sb.append("CcExist=" + CcExist+"\n");
    sb.append("BccExist=" + BccExist+"\n");
    sb.append("LinkedIDExist=" + LinkedIDExist+"\n");
    sb.append("MessageClassExist=" + MessageClassExist+"\n");
    sb.append("TimeStampExist=" + TimeStampExist+"\n");
    sb.append("ExpiryDateExist=" + ExpiryDateExist+"\n");
    sb.append("ExpiryDateAbsoluteExist=" + ExpiryDateAbsoluteExist+"\n");
    sb.append("EarliestDeliveryTimeExist=" + EarliestDeliveryTimeExist+"\n");
    sb.append("EarliestDeliveryTimeAbsoluteExist=" +
              EarliestDeliveryTimeAbsoluteExist+"\n");
    sb.append("DeliveryReportExist=" + DeliveryReportExist+"\n");
    sb.append("ReadReplyExist=" + ReadReplyExist+"\n");
    sb.append("ReplyChargingExist=" + ReplyChargingExist+"\n");
    sb.append("ReplyDeadlineExist=" + ReplyDeadlineExist+"\n");
    sb.append("ReplyDeadlineAbsoluteExist=" + ReplyDeadlineAbsoluteExist+"\n");
    sb.append("ReplyChargingSizeExist=" + ReplyChargingSizeExist+"\n");
    sb.append("PriorityExist=" + PriorityExist+"\n");
    sb.append("SubjectExist=" + SubjectExist+"\n");
    sb.append("AllowAdaptationsExist=" + AllowAdaptationsExist+"\n");
    sb.append("ChargedPartyExist=" + ChargedPartyExist+"\n");
    sb.append("FeeTerminalIDExist=" + ChargedPartyIDExist+"\n");
    sb.append("ContentExist=" + ContentExist+"\n");
    sb.append("DistributionIndicatorExist=" + DistributionIndicatorExist+"\n");
    return sb.toString();
  }
}