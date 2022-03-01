package paganinik;

import java.nio.charset.StandardCharsets;

/**
 * This class represents the USB stick.
 *
 * It accepts a message and stores it to the internal media.
 *
 * Think of it as a "secure SD card" adapter.
 */
public class CrypStick {
    private Media media;
    private Encrypter encrypter;
    private boolean encrypt;


    public CrypStick() {
        media = new Media();
        encrypter = null;
        encrypt = false;
    }

    public void setMessage(String message) {
        byte[] plaintext = message.getBytes(StandardCharsets.UTF_8);


        byte[] ciphertext = encrypter.encrypt(plaintext);
        media.set(ciphertext);
    }

    public String getMessage() {
        byte[] ciphertext = media.get();


        byte[] plaintext = encrypter.decrypt(ciphertext);
        return new String(plaintext,StandardCharsets.UTF_8);
    }

    protected Media getMedia() {
        return media;
    }

    public void setEncryptionStrategy(Encrypter e){
        encrypter = e;
    }
}
