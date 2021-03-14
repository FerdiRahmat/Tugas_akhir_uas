import java.util.Scanner;
public class project
{
	public static void main(String[]args) throws Exception{
		int jumlah,i,j,swap,pilih,lagi,alas,tinggi,luas,lebar,panjang,diagonal1,diagonal2,sisi,sisi_atas,sisi_bawah;
		double pi=3.14,r;
		Scanner scan=new Scanner(System.in);
		String text[]={"P","R","O","G","R","A","M"," ","P","E","R","H","I","T","U","N","G","A","N"," ","L","U","A","S"," ","B","A"
		,"N","G","U","N"," ","D","A","T","A","R"};
		int a=0;
		System.out.println("\t====================**********====================");
		System.out.print("\t\t");
		while(a<text.length){
			Thread.sleep(60);
			System.out.print(text[a]);
			a++;
		}
		System.out.println();
		System.out.println("\t====================**********====================");
		System.out.println();
		
		int array[]={3,5,1,4,6,8,2,7};
		String list[]={"luas segitiga","luas persegi","luas persegi panjang","luas lingkaran","luas trapesium","luas jajar genjang",
		"luas layanglayang","luas Belah Ketupat"};

		for(i=0; i<(array.length-1);i++)
		{
		for(j=0;j<array.length-i-1;j++)
			{
			if (array[j]>array[j+1])
			{
			swap = array[j];
			array[j] = array[j+1];
			array[j+1]=swap;{}
		}
		}
		}
		System.out.println("===========================");
		System.out.println("DAFTAR RUMUS :");
		for(i=0;i<array.length;i++){
			System.out.println(array[i]+". "+list[i]);
		}
		System.out.println("===========================");
		pil:
		for(;;){
			System.out.print("\nPilih Rumus yang Anda Butuhkan : ");
			pilih=scan.nextInt();
			System.out.print("Pilihan Rumus anda No : "+pilih);
			System.out.println();
			switch (pilih){
				case 1:
				double luas_segitiga;
				System.out.println("Perhitungan Luas Segitiga");
				System.out.print("Masukan Alas = ");
				alas=scan.nextInt();
				System.out.print("Masukan Tinggi = ");
				tinggi=scan.nextInt();
				luas_segitiga=alas*tinggi/2;
				System.out.println("luas segitiga adalah =  "+luas_segitiga);
			break;
				case 2:
				int luas_persegi;
				System.out.println("Perhitungan Luas Persegi");
				System.out.print("Masukan Sisi = ");
				sisi=scan.nextInt();
				luas_persegi=sisi*sisi;
				System.out.println("luas persegi adalah =  "+luas_persegi);
			break;
				case 3:
				int luas_persegi_panjang;
				System.out.println(" Perhitungan Luas Persegi Panjang");
				System.out.print("Masukan Panjang = ");
				panjang=scan.nextInt();
				System.out.print("Masukan Lebar = ");
				lebar=scan.nextInt();
				luas_persegi_panjang=panjang*lebar;
				System.out.println("luas luas persegi panjang adalah =  "+luas_persegi_panjang);
			break;
				case 4:
				double luas_lingkaran;
				System.out.println("Perhitungan Luas Lingkaran");
				System.out.print("Masukan Jari-Jari = ");
				r=scan.nextInt();
				luas_lingkaran=pi*r*r;
				System.out.println("luas lingkaran adalah =  "+luas_lingkaran);
			break;
				case 5:
				int luas_trapesium;
				System.out.println("Perhitungan Luas Trapesium");
				System.out.print("Masukan Sisi Atas = ");
				sisi_atas=scan.nextInt();
				System.out.print("Masukan Sisi Bawah  = ");
				sisi_bawah=scan.nextInt();
				System.out.print("Masukan Tinggi = ");
				tinggi=scan.nextInt();
				luas_trapesium=(sisi_atas+sisi_bawah)*tinggi/2;
				System.out.println("luas lingkaran adalah =  "+luas_trapesium);

			break;
				case 6:
				double luas_jajar_genjang;
				System.out.println("Perhitungan Luas Jajar Genjang");
				System.out.print("Masukan Alas = ");
				alas=scan.nextInt();
				System.out.print("Masukan Tinggi  = ");
				tinggi=scan.nextInt();
				luas_jajar_genjang=alas*tinggi;
				System.out.println("luas Jajar Genjang adalah =  "+luas_jajar_genjang);

			break;
				case 7:
				double luas_layanglayang;
				System.out.println("Perhitungan Luas Layang-Layang");
				System.out.print("Masukan Diagonal 1 = ");
				diagonal1=scan.nextInt();
				System.out.print("Masukan Diagonal 2  = ");
				diagonal2=scan.nextInt();
				luas_layanglayang=diagonal1*diagonal2/2;
				System.out.println("luas Luas Layang-Layang adalah =  "+luas_layanglayang);

			break;
				case 8:
				double luas_Belah_Ketupat;
				System.out.println("Perhitungan Luas Belah Ketupat");
				System.out.print("Masukan Diagonal 1 = ");
				diagonal1=scan.nextInt();
				System.out.print("Masukan Diagonal 2  = ");
				diagonal2=scan.nextInt();
				luas_Belah_Ketupat=diagonal1*diagonal2/2;
				System.out.println("luas Belah Ketupat adalah =  "+luas_Belah_Ketupat);

			break;
			default:
			System.out.println();
			System.out.println("pilihan anda tidak tersedia");
			continue pil;

			}
			System.out.print("Apakah Anda Ingin Coba lagi? (1:0) = ");
				lagi=scan.nextInt();
				System.out.println();
				if(lagi==1){
					continue pil;
				}else{
					System.out.println("\t====================**********====================");
					System.out.println("\t\t\t Terima Kasih");
					System.out.println("\t====================**********====================");
					System.exit(0);
				}
			break;
		}
	}
}
