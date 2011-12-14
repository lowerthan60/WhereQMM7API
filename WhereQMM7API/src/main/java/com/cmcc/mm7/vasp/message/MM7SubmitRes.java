/**File Name:MM7SubmitRes.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-2-2
 * */

package com.cmcc.mm7.vasp.message;

public class MM7SubmitRes extends MM7RSRes
{
  private String MessageID;
  private boolean MessageIDExist;
  public MM7SubmitRes()
  {
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
  public String toString()  //���ض�����ı���ʾ
  {
    StringBuffer sb = new StringBuffer();
    sb.append("MessageID=" + MessageID+"\n");
    sb.append("MessageIDExist=" + MessageIDExist+"\n");
    return sb.toString();
  }
}