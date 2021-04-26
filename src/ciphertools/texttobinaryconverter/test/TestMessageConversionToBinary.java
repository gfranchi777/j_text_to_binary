package ciphertools.texttobinaryconverter.test;

import ciphertools.texttobinaryconverter.utils.ConvertMessageToBinary;
import ciphertools.texttobinaryconverter.utils.Message;

public class TestMessageConversionToBinary {
    public static void main(String[] args) {
        Message clearMessage = new Message();
        Message binaryMessage = new Message();
        
        ConvertMessageToBinary convertToBinary = new ConvertMessageToBinary();
        
        clearMessage.setMessage("A B C 1 2 3.");
        binaryMessage = convertToBinary.convertMessageToBinary(clearMessage);
        
        System.out.println("Clear Message : " + clearMessage.getMessage());
        System.out.println("Binary Message: " + binaryMessage.getMessage());
    }
}
