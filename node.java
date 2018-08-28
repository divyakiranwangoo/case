
 
public class node {
     
{
   public static void main(String args[]) 
{
 
   Date timestamp;
     String data;
     int nodeNumber;
     String nodeId, refNodeId,childRefNodeId,genesisRefNodeId,HashValue;
    
     node(Date timestamp,String data,int nodeNumber,String nodeId, String refNodeId,String childRefNodeId,String genesisRefNodeId, String HashValue)
     {    
         this.timestamp=timestamp;
         this.data=data;
         this.nodeNumber=nodeNumber;
         this.nodeId=nodeId;
         this.refNodeId=refNodeId;
         this.childRefNodeId=childRefNodeId;
         this.genesisRefNodeId=genesisRefNodeId;
         this.HashValue=HashValue;
         
}
     public Date setTimeStamp()
     {
         return timestamp;
     }
     public void getData( String data)
     { 
         this.data=data;
         
     }
     public String setData()
     {
         return data;
}
     public void getNodeNumber()
     {
         this.nodeNumber=nodeNumber;
     }
     public int setNodeNumber()
     {
         return nodeNumber;
         
     }
public void getNodeId()
{
    this.nodeId=nodeId;
    
}
public String setNodeId()
{
    return nodeId;
}
public void getRefNodeId()
{
    this.refNodeId=refNodeId;
}
public String setRefNodeId()
{
    return refNodeId;
    
}
public void getChildRef()
{
    this.childRefNodeId=childRefNodeId;
}
public String setChildRef()
{
    return childRefNodeId;
}
public void getGenesisRefNodeId()
{
    this.genesisRefNodeId=GenesisRefNodeId()
}
public String setGenesis()
{
    return genesisRefNodeId;
}
}
}
