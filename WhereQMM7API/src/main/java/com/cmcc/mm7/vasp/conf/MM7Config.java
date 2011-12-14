/**File Name:MM7Config.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-1-3
 * */

package com.cmcc.mm7.vasp.conf;

import java.io.*;
import java.util.*;
import com.cmcc.mm7.vasp.conf.MM7ConfigManager;

public class MM7Config
{
  private int AuthenticationMode;
  private String UserName;
  private String Password;
  private String Digest;
  private String MMSCURL;
  private List MMSCIP;
  private String LogPath;
  private int LogLevel;
  private int MaxMsgSize;
  private boolean UseSSL;
  private String CharSet;
  private String ListenIP;
  private int ListenPort;
  private int TimeOut;
  private int ReSendCount;
  private HashMap hashmap = new HashMap();
  public int BackLog;
  private int LogNum;
  private int LogInterval;
  private int LogSize;
  private String MmscId;
  private String ConnConfigName;
  /**Ĭ�Ϲ��췽��*/
  public MM7Config()
  {
  }
  /**���췽�����������봫��ϵͳ�����ļ���*/
  public MM7Config(String configFileName)
  {
    load(configFileName);
  }
  /**���������ļ�*/
  public void load(String configFileName)
  {
    MM7ConfigManager mm7c = new MM7ConfigManager();
    mm7c.load(configFileName);
    hashmap = mm7c.hashmap;
    AuthenticationMode = Integer.parseInt((String)hashmap.get("AuthenticationMode"));
    UserName = (String)hashmap.get("UserName");
    Password = (String)hashmap.get("Password");
    Digest = (String)hashmap.get("Digest");
    MaxMsgSize = Integer.parseInt((String)hashmap.get("MaxMessageSize"));
    LogPath = (String)hashmap.get("LogPath");
    LogLevel = Integer.parseInt((String)hashmap.get("logLevel"));
    CharSet = (String)hashmap.get("Charset");
    MMSCURL = (String)hashmap.get("mmscURL");
    MMSCIP = (List) hashmap.get("mmscIP");
    UseSSL = Boolean.getBoolean((String)hashmap.get("UseSSL"));
    ListenIP = (String)hashmap.get("ListenIP");
    ListenPort = Integer.parseInt((String)hashmap.get("ListenPort"));
    BackLog = Integer.parseInt((String)hashmap.get("BackLog"));
    TimeOut = Integer.parseInt((String)hashmap.get("TimeOut"));
    ReSendCount = Integer.parseInt((String)hashmap.get("ReSendCount"));
    LogNum = Integer.parseInt((String)hashmap.get("LogNum"));
    LogInterval = Integer.parseInt((String)hashmap.get("LogInterval"));
    LogSize = Integer.parseInt((String)hashmap.get("LogSize"));
    MmscId = (String)hashmap.get("MmscID");
  }
  /**���������ļ�*/
  public void save(String configFileName)
  {
    StringBuffer sb = new StringBuffer();
    sb.append("<?xml version=\"1.0\"?>");
    sb.append("\r\n");
    sb.append("<vasp:MM7Config xmlns:vasp=\"http://mms.chinamobile.com/mm7ConfigSchema\">");
    sb.append("\r\n");
    sb.append("<AuthenticationMode>"+AuthenticationMode+"</AuthenticationMode>");
    sb.append("\r\n");
    sb.append("<UserName>"+UserName+"</UserName>");
    sb.append("\r\n");
    sb.append("<Password>"+Password+"</Password>");
    sb.append("\r\n");
    sb.append("<Digest>"+Digest+"</Digest>");
    sb.append("\r\n");
    sb.append("<MaxMessageSize>"+MaxMsgSize+"</MaxMessageSize>");
    sb.append("\r\n");
    sb.append("<LogPath>"+LogPath+"</LogPath>");
    sb.append("\r\n");
    sb.append("<logLevel>"+LogLevel+"</logLevel>");
    sb.append("\r\n");
    sb.append("<Charset>"+CharSet+"</Charset>");
    sb.append("\r\n");
    sb.append("<mmscURL>"+MMSCURL+"</mmscURL>");
    sb.append("\r\n");
    if(!MMSCIP.isEmpty())
    {
      for(int i = 0;i<MMSCIP.size();i++)
      {
        String mmscip = (String)MMSCIP.get(i);
        sb.append("<mmscIP>"+mmscip+"</mmscIP>");
        sb.append("\r\n");
      }
    }
    sb.append("<MmscId>" + MmscId + "</MmscId>");
    sb.append("<UseSSL>"+UseSSL+"</UseSSL>");
    sb.append("\r\n");
    sb.append("<ListenIP>"+ListenIP+"</ListenIP>");
    sb.append("\r\n");
    sb.append("<ListenPort>"+ListenPort+"</ListenPort>");
    sb.append("\r\n");
    sb.append("<BackLog>"+BackLog+"</BackLog>");
    sb.append("\r\n");
    sb.append("<TimeOut>"+TimeOut+"</TimeOut>");
    sb.append("\r\n");
    sb.append("<ReSendCount>"+ReSendCount+"</ReSendCount>");
    sb.append("\r\n");
    sb.append("<LogNum>"+LogNum+"</LogNum>");
    sb.append("\r\n");
    sb.append("<LogInterval>"+LogInterval+"</LogInterval>");
    sb.append("\r\n");
    sb.append("<LogSize>"+LogSize+"</LogSize>");
    sb.append("\r\n");
    sb.append("</vasp:MM7Config>");
    try{
      FileOutputStream fileout = new FileOutputStream(configFileName);
      fileout.write(sb.toString().getBytes());
      fileout.close();
    }catch(FileNotFoundException fnfe)
    {
      System.err.println("�ļ�����ԭ��"+fnfe);
    }catch(IOException ioe){
      ioe.printStackTrace();
    }
  }
  public void setAuthenticationMode (int authMode)  //���ü�Ȩ��ʽ
  {
    AuthenticationMode = authMode;
  }
  public int getAuthenticationMode()  //��ü�Ȩ��ʽ
  {
    return(AuthenticationMode);
  }
  public void setUserName( String   s_userName)  //���ü�Ȩ�û���
  {
    UserName = s_userName;
  }
  public String  getUserName()  //��ü�Ȩ�û���
  {
    return(UserName);
  }
  public void setPassword(String s_password)  //���ü�Ȩ����
  {
    Password = s_password;
  }
  public String getPassword()  //��ü�Ȩ����
  {
    return(Password);
  }
  public void setDigest(String dig)
  {
    Digest = dig;
  }
  public String getDigest()
  {
    return Digest;
  }
  public void setMMSCURL(String urL)  //����MMSC��URL
  {
    MMSCURL = urL;
  }
  public String getMMSCURL()  //���MMSC��URL
  {
    return(MMSCURL);
  }
  public void setMMSCIP(List ip)  //����MMSC��IP�б�
  {
    MMSCIP = ip;
  }
  public List getMMSCIP()  //���MMSC��IP�б�
  {
    return(MMSCIP);
  }
  public void addMMSCIP(String ip)  //���MMSC��IP
  {
    MMSCIP.add(ip);
  }
  public void setLogPath(String logPath)  //������־�ļ���·��
  {
    LogPath = logPath;
  }
  public String getLogPath()  //�����־�ļ���·��
  {
    return(LogPath);
  }
  public void setLogLevel(int logLevel)  //������־����
  {
    LogLevel = logLevel;
  }
  public int getLogLevel()  //�����־����
  {
    return(LogLevel);
  }
  public void setMaxMsgSize(int maxSize)  //��������������Ϣ�Ĵ�С
  {
    MaxMsgSize = maxSize;
  }
  public int getMaxMsgSize()  //�������������Ϣ�Ĵ�С
  {
    return(MaxMsgSize);
  }
  public void setUseSSL(boolean usessl)  //�����Ƿ�����SSL����
  {
    UseSSL = usessl;

  }
  public boolean getUseSSL()  //����Ƿ�����SSL����
  {
    return UseSSL;
  }
  public void setCharSet(String charSet)  //���ö���Ϣ������ַ���
  {
    CharSet = charSet;
  }
  public String getCharSet()  //��ö���Ϣ������ַ���
  {
    return(CharSet);
  }
  public void setListenIP(String listenIP)  //���ü���IP��ַ
  {
    ListenIP = listenIP;
  }
  public String getListenIP()  //��ü���IP��ַ
  {
    return(ListenIP);
  }
  public void setListenPort(int port)  //���ü����˿�
  {
    ListenPort = port;
  }
  public int getListenPort()  //��ü����˿�
  {
    return(ListenPort);
  }
  public void setBackLog(int backlog)
  {
    BackLog = backlog;
  }
  public int getBackLog()
  {
    return BackLog;
  }
  public void setTimeOut(int timeout)
  {
    TimeOut = timeout;
  }
  public int getTimeOut()
  {
    return TimeOut;
  }
  public void setReSendCount(int resend)
  {
    ReSendCount = resend;
  }
  public int getReSendCount()
  {
    return ReSendCount;
  }
  public void setLogNum(int lognum)
  {
    LogNum = lognum;
  }
  public int getLogNum()
  {
    return LogNum;
  }
  public void setLogInterval(int loginterval)
  {
    LogInterval = loginterval;
  }
  public int getLogInterval()
  {
    return LogInterval;
  }
  public void setLogSize(int logsize)
  {
    LogSize = logsize;
  }
  public int getLogSize()
  {
    return LogSize;
  }
  public void setMmscId(String mmscId)
  {
    MmscId = mmscId;
  }
  public String getMmscId()
  {
    return MmscId;
  }
  public void setConnConfigName(String name)
  {
    ConnConfigName = name;
  }
  public String getConnConfigName()
  {
    return ConnConfigName;
  }
}