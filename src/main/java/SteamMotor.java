import javax.swing.JOptionPane;

public class SteamMotor {

    private static int a;
	public static void main (String[] args) 
	{
		JOptionPane.showMessageDialog(null,"WELCOME STEAM ROTOM ARDON");
		
		
		
		String Cuci;
		int harga = 0;
	
		Cuci = JOptionPane.showInputDialog(null,"BERAPA KALI CUCI");
		
		switch (harga) {
		    case 1: 
		}
		if (a == 1) {
			JOptionPane.showMessageDialog(null,"PEMBAYARAN");
		}	
		if (a == 2) {
			JOptionPane.showMessageDialog(null,"PEMBAYARAN");
		}	
		if (a == 3) {
			JOptionPane.showMessageDialog(null,"GRATIS CUCI");
		}
		
                
		
		
		
		
		
		
		
		

	// Motor
		String Motor;
		int a;
		{
		JOptionPane.showMessageDialog(null,"SILAHKAN PILIH JENIS MOTOR");
		{
		Motor = JOptionPane.showInputDialog(null,"PILIHAN MOTOR : \n1.MOTOR BESAR \n2.MOTOR KECIL ");
		a = Integer.parseInt(Motor);
		
		if (a == 1) {
			JOptionPane.showMessageDialog(null,"MOTOR BESAR 20.000");
		}	
		if (a == 2) {
			JOptionPane.showMessageDialog(null,"MOTOR KECIL 15.000");
		}	
		
			
		// Salju
				String Salju;
				int b;
			
				JOptionPane.showMessageDialog(null,"SILAHKAN PILIH SALJU");
				
				Salju = JOptionPane.showInputDialog(null,"PILIHAN SALJU : \n1.PUTIH \n2.PINK \n3.BIRU");
				b = Integer.parseInt(Salju);
				
				if (b == 1) {
					JOptionPane.showMessageDialog(null,"Salju Putih");
				}	
				if (b == 2) {
					JOptionPane.showMessageDialog(null,"Salju Pink");
				}
				if (b == 3) {
					JOptionPane.showMessageDialog(null,"Salju Biru");
				}
			
				JOptionPane.showMessageDialog(null,"----PROSES CUCI----");
				
				
		//CUCI		
				
				
				
				JOptionPane.showInputDialog(null,"PEMABAYARAN  \n1 20.000 \n2 15.000");
				if (b == 1) {
					JOptionPane.showMessageDialog(null,"20.000");
				}	
				if (b == 2) {
					JOptionPane.showMessageDialog(null,"15.000");
					
					int Harga1 = 20000;
					int Harga2 = 15000;
					int TotalBayar;
					int Kembalian;
					int Totalharga = 0;
					boolean s = true;
					
					// Kalkulasi 
					TotalBayar = Harga1 ;
					TotalBayar = Harga2 ;
					
					if (TotalBayar >= 15000) {
					if (TotalBayar >= 20000) {
					JOptionPane.showMessageDialog(null, "Total yang harus dibayar = Rp."+TotalBayar, "Total Pemayaran", JOptionPane.INFORMATION_MESSAGE);
					
					
					int bayar = Integer.parseInt(JOptionPane.showInputDialog (null, "Masukkan Jumlah Uang anda"));
					
					Kembalian = bayar - TotalBayar;
					
					JOptionPane.showMessageDialog(null,  "Kembaliannya = Rp."+Kembalian, "Kembalian", JOptionPane.INFORMATION_MESSAGE);
				}
		
				
				}
				}
		}
                }
        }
}
	


