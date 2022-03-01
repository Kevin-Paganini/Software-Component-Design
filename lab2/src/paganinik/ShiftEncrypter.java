package paganinik;


/**
 * Encrypts message by shifting the value of each hexadecimal representation
 * of a letter
 * @author paganinik
 */
public class ShiftEncrypter implements Encrypter {
    private int shift;
    private final byte MAX = (byte)256;
    private final int MIN = (byte)1;

    /**
     * Constructor to encapsulate and make sure a shift is given
     * @param shift
     */
    public ShiftEncrypter(int shift){
        this.shift = shift;
    }

    /**
     * Decrypts the message by subtracting the shift from the encrypted message
     * @param msg
     * @return decrypted message
     */
    @Override
    public byte[] decrypt(byte[] msg)
    {
        byte[] normal = new byte[msg.length];
        for(int i = 0; i<msg.length; i++) {
            normal[i] = (byte)(msg[i]-shift);
            if(normal[i] <= MIN) {
                normal[i] = (byte)(normal[i]+MAX);
            }
        }
        return normal;
    }

    /**
     * Shifts hexadecimal values of letters to encrypt a message
     * @param msg
     * @return encrypted message
     */
    @Override
    public byte[] encrypt(byte[] msg)
    {
        byte[] shifted = new byte[msg.length];
        for(int i = 0; i<msg.length; i++) {
            shifted[i] = (byte)(msg[i]+shift);
            if(shifted[i] >= MAX) {
                shifted[i] = (byte)(shifted[i]-MAX);
            }
        }
        return shifted;
    }
}
