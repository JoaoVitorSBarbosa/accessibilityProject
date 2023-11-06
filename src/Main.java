public class Main {
    public static void main(String[] args) throws Exception {
        SpeechUtils su = new SpeechUtils();

        su.init("kevin16");
        // high quality
        su.doSpeak("it is a first attempt to speak");
        su.terminate();
    }
}