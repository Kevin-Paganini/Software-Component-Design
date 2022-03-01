package paganinik;



/**
 * A encrypter that does nothing...
 * @author paganinik
 */
public class NullEncrypter implements Encrypter {
    /**
     * Returns the message in bytes
     * @param msg
     * @return
     */
    @Override
    public byte[] decrypt(byte[] msg) {
        return msg;
    }

    /**
     * Returns the message in bytes
     * @param msg
     * @return
     */
    @Override
    public byte[] encrypt(byte[] msg) {
     return msg;
    }
}
