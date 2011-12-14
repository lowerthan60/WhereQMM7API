/**File Name:MM7ReplaceReq.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-2-2
 * */

package com.cmcc.mm7.vasp.message;

import java.util.Date;
import com.cmcc.mm7.vasp.common.MMContent;

public class MM7ReplaceReq extends MM7VASPReq
{
  private String VASPID;
  private boolean VASPIDExist;
  private String VASID;
  private boolean VASIDExist;
  private String MessageID;
  private boolean MessageIDExist;
  private String ServiceCode;
  private boolean ServiceCodeExist;
  private Date TimeStamp;
  private boolean TimeStampExist;
  private Date EarliestDeliveryTime;
  private boolean EarliestDeliveryTimeExist;
  private boolean EarliestDeliveryTimeAbsoluteExist;
  private long EarliestTimeDuration;
  private boolean ReadReply;
  private boolean ReadReplyExist;
  private boolean AllowAdaptations;
  private boolean AllowAdaptationsExist;
  private MMContent Content = new MMContent();
  private boolean ContentExist;
  private boolean DistributionIndicator;
  private boolean DistributionIndicatorExist;

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
  public void setMessageID(String messageID)  //����MessageID
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
  public void setServiceCode(String serviceCode)  //����ҵ�����
  {
    ServiceCode = serviceCode;
    ServiceCodeExist = true;
  }
  public String getServiceCode()  //���ҵ�����
  {
    return(ServiceCode);
  }
  public boolean isServiceCodeExist()  //�Ƿ����ҵ�����
  {
    return(ServiceCodeExist);
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
  public void setEarliestDeliveryTime(Date time)  //���ý�MM���͸����շ�����������ʱ�䣨����ʱ�䣩
  {
    EarliestDeliveryTime = time;
    EarliestDeliveryTimeAbsoluteExist = true;
  }
  public void setEarliestDeliveryTime(long duration)  //duration�ṩ���ʱ�䣬����Ϊ��λ
  {
    EarliestTimeDuration = duration;
    EarliestDeliveryTimeExist = true;
  }
  public long getEarliestDeliveryTimeRelative()  //��ý�MM���͸����շ��������������ʱ��
  {
    return(EarliestTimeDuration);
  }
  public Date getEarliestDeliveryTimeAbsolute()  //��ý�MM���͸����շ��������������ʱ��
  {
    return(EarliestDeliveryTime);
  }
  public boolean isEarliestDeliveryTimeExist()  //�Ƿ���ڽ�MM���͸����շ�����������ʱ�䡣
  {
    return(EarliestDeliveryTimeExist);
  }
  public boolean isEarliestDeliveryTimeAbsoluteExist()  //�Ƿ����ʱ���ʽ
  {
    return(EarliestDeliveryTimeAbsoluteExist);
  }
  public void setReadReply(boolean readreply)  //�����Ƿ���Ҫ��ȡ����
  {
    ReadReply = readreply;
    ReadReplyExist = true;
  }
  public boolean getReadReply()  //����Ƿ���Ҫ��ȡ����
  {
    return(ReadReply);
  }
  public boolean isReadReplyExist()  //�Ƿ�����Ƿ���Ҫ��ȡ����
  {
    return(ReadReplyExist);
  }
  public void setAllowAdaptations(boolean allowAdaptations)  //����allowAdaptations
  {
    AllowAdaptations = allowAdaptations;
    AllowAdaptationsExist = true;
  }
  public boolean getAllowAdaptations()  //���allowAdaptations
  {
    return(AllowAdaptations);
  }
  public boolean isAllowAdaptationsExist()  //�Ƿ����allowAdaptations
  {
    return(AllowAdaptationsExist);
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
  public void setDistributionIndicator (boolean MDI)  //����DistributionIndicator
  {
    DistributionIndicator = MDI;
    DistributionIndicatorExist = true;
  }
  public boolean getDistributionIndicator()  //���DistributionIndicator
  {
    return(DistributionIndicator);
  }
  public boolean isDistributionIndicatorExist ()  //�Ƿ����DistributionIndicator
  {
    return(DistributionIndicatorExist);
  }
  //���ض�����ı���ʾ
  public String toString()
  {
    StringBuffer sb = new StringBuffer();
    sb.append("VASPID=" + VASPID+"\n");
    sb.append("VASPIDExist=" + VASPIDExist+"\n");
    sb.append("VASID=" + VASID+"\n");
    sb.append("VASIDExist=" + VASIDExist+"\n");
    sb.append("MessageID=" + MessageID+"\n");
    sb.append("MessageIDExist=" + MessageIDExist+"\n");
    sb.append("ServiceCode=" + ServiceCode+"\n");
    sb.append("ServiceCodeExist=" + ServiceCodeExist+"\n");
    sb.append("TimeStamp=" + TimeStamp+"\n");
    sb.append("TimeStampExist=" + TimeStampExist+"\n");
    sb.append("EarliestDeliveryTime=" + EarliestDeliveryTime+"\n");
    sb.append("EarliestDeliveryTimeExist=" + EarliestDeliveryTimeExist+"\n");
    sb.append("EarliestDeliveryTimeAbsoluteExist=" +EarliestDeliveryTimeAbsoluteExist+"\n");
    sb.append("EarliestTimeDuration=" + EarliestTimeDuration+"\n");
    sb.append("ReadReply=" + ReadReply+"\n");
    sb.append("ReadReplyExist=" + ReadReplyExist+"\n");
    sb.append("AllowAdaptations=" + AllowAdaptations+"\n");
    sb.append("AllowAdaptationsExist=" + AllowAdaptationsExist+"\n");
    sb.append("Content=" + Content+"\n");
    sb.append("ContentExist=" + ContentExist+"\n");
    sb.append("DistributionIndicator=" + DistributionIndicator+"\n");
    sb.append("DistributionIndicatorExist=" + DistributionIndicatorExist+"\n");
    return sb.toString();
  }
}