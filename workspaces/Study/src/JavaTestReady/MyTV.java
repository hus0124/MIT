package JavaTestReady;

public class MyTV {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
    	isPowerOn = !isPowerOn;
    }

    void volumeUp() {
        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
    	if(volume < MAX_VOLUME)
    		++volume;
    		
    }

    void volumeDown() {
        // (3) volume 값이 MIN_VOLUME 보다 클 때만 값을 1 감소시킨다.
    	if(volume > MIN_VOLUME)
    		--volume;
    }

    void channelUp() {
        // (4) channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL 보다 크면, channel의 값을 MIN_CHANNEL로 바꾼다.
    	if(channel < MAX_CHANNEL)
    		++channel;
    	else channel = MIN_CHANNEL;
    }

    void channelDown() {
        // (5) channel의 값을 1 감소시킨다.
        // 만일 channel이 MIN_CHANNE 보다 작으면, channel의 값을 MAX_CHANNEL로 바꾼다.
    	if(channel > MIN_CHANNEL)
    		--channel;
    	else channel = MAX_CHANNEL;
    }
}
