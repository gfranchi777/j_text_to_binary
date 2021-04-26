package ciphertools.texttobinaryconverter.utils;

public class ConvertMessageToBinary {
    
    Message binaryMessage;
    
    public ConvertMessageToBinary() {
      binaryMessage = new Message();    
    }
    
    public ConvertMessageToBinary(Message clearText){
        binaryMessage = new Message();
    }
    
    public Message getBinaryMessage(){
        return binaryMessage;
    }
    
    public Message convertMessageToBinary(Message clearMessage) {
        char[] clearMessageCharArray = new char[clearMessage.getLength()];
        String formattedBinaryString = "";
        
        clearMessageCharArray = clearMessage.getMessage().toCharArray();
        
        for(int i = 0; i < clearMessageCharArray.length; i++){
            if((int)clearMessageCharArray[i] < 65 && 
               (int)clearMessageCharArray[i] > 90) {
                formattedBinaryString = "" + clearMessageCharArray[i];
            } else {
                formattedBinaryString = Integer.toBinaryString(
                                        (int)clearMessageCharArray[i]);
            
                while(formattedBinaryString.length() < 8){
                      formattedBinaryString = "0" + formattedBinaryString; 
                }
            }
            
            binaryMessage.setMessage(binaryMessage.getMessage() + 
                                     formattedBinaryString);            
        }   
        return binaryMessage;
    }
}
