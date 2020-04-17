import java.util.dizis;

public class dinamikdizi {
	private Object dizi[];
	private int boyut;
	private int kapasite;
	
	public dinamikdizi() {
		dizi = new Object[1];
		boyut=0;
		kapasite=1;
	}
	
	public void append(Object element) {
		if(boyut == kapasite) {
			reboyut();
		}
		dizi[boyut] = element;
		boyut++;
	}
	
	public void remove() {
		if(boyut!=0) {
			dizi[boyut-1]=null; 
			boyut--;
		}
	}
	
	public void resize() {
		Object templist[]=new Object[kapasite+2];
		for(int i=0;i < kapasite; i++) {
			templist[i]=dizi[i];
		}
		dizi=templist;
		kapasite=kapasite+2;
	}
	
	public Object[] getdizi() {
		return dizi;
	}

	public void setdizi(Object[] dizi) {
		this.dizi = dizi;
	}

	public int getboyut() {
		return boyut;
	}

	public void setboyut(int boyut) {
		this.boyut = boyut;
	}

	public int getkapasite() {
		return kapasite;
	}

	public void setkapasite(int kapasite) {
		this.kapasite = kapasite;
	}
	
	
}
