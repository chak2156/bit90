package day07.exam;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class TV {
	int volume =20;
	int channel =7;
	int getVolume(){
		return volume;
	};
	int getChannel(){
		
		return channel;
	}
	int setChannel(int i){
		this.channel=i;
		return channel;
	}
	int channelUp(){
		this.channel++;
		return channel;
	}
	void powerOn(){
		
		System.out.println("티비 전원을 켭니다.");
	}
	void powerOff(){
		System.out.println("티비 전원을 끕니다.");
	}
	

}
