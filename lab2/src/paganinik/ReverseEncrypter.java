package paganinik;



public class ReverseEncrypter implements Encrypter {

    @Override
    public byte[] decrypt(byte[] msg) {
        for(int i = 0; i < msg.length / 2; i++)
        {
            byte temp = msg[i];
            msg[i] = msg[msg.length - i - 1];
            msg[msg.length - i - 1] = temp;
        }
        return msg;
    }

    @Override
    public byte[] encrypt(byte[] msg) {
        for(int i = 0; i < msg.length / 2; i++)
        {
            byte temp = msg[i];
            msg[i] = msg[msg.length - i - 1];
            msg[msg.length - i - 1] = temp;
        }
        return msg;
    }


}
