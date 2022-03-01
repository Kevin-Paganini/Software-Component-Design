package paganinik;


/**
 * XOR encrypter
 * @author paganinik
 */
public class XOREncrypter implements Encrypter {
    /**
     * Key to be used to encrypt data
     */
    private byte[] key;

    /**
     * Constructor makes sure a key is given
     * @param key
     */
    public XOREncrypter(byte[] key){
        this.key = key;
    }


    /**
     * decrypts msg using key and XOR encryption method
     * @param msg
     * @return decrypted message
     */
    @Override
    public byte[] decrypt(byte[] msg) {

        return encrypt(msg);
    }
    /**
     * encrypts msg using key and XOR encryption method
     * @param msg
     * @return encrypted message
     */
    @Override
    public byte[] encrypt(byte[] msg) {
        byte[] encrypted = new byte[msg.length];
        int count = 0;
        for(int i = 0; i<msg.length; i++) {

            if(count >= key.length) {
                count = 0;
            }
            encrypted[i] = (byte)(msg[i] ^ key[count]);
            count++;
        }
        return encrypted;
    }
}
