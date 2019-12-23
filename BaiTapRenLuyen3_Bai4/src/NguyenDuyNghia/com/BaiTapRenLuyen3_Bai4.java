package NguyenDuyNghia.com;

import java.util.Scanner;

public class BaiTapRenLuyen3_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bạn muốn nhập bao nhiêu phần tử:");
		int n=new Scanner(System.in).nextInt();
		int[] mangSo=new int[n];
		
		for(int i=0;i<mangSo.length;i++)
		{
			System.out.println("Mời bạn nhập phần tử thứ "+(i+1)+ " vào mảng:");
			int phanTu=new Scanner(System.in).nextInt();
			mangSo[i]=phanTu;
			
			
		}
		
		timSoChanLe(mangSo);
		timSoNT(mangSo);

//		System.out.println("Mời bạn nhập 1 chuỗi số : ");
//		String str =new Scanner(System.in).nextLine();
//		String[] arr=str.split(" ");
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			
//		}
		
		
	}
	
	static void timSoChanLe(int[] M)
	{
		String soLe="";
		int sumSoLe=0;
		String soChan="";
		int sumSoChan=0;
		for(int i=0;i<M.length;i++)
		{
			if(M[i]%2!=0)
			{
				soLe+=M[i]+" ";
				sumSoLe+=M[i];
			}
			else
			{
				soChan+=M[i]+" ";
				sumSoChan+=M[i];
			}
			
		}
		System.out.println("Các số lẻ có trong mảng là:\n"+soLe);
		System.out.println("Tổng các số lẻ có trong mảng:\n "+sumSoLe);
		System.out.println("Các số chẵn có trong mảng là:\n"+soChan);
		System.out.println("Tổng các số chẵn có trong mảng:\n "+sumSoChan);
	
		
	}
	static void timSoNT(int[] M)
	{
		
		String soNguyenTo="";
		String soKoNguyenTo="";
		for(int i=0;i<M.length;i++)
		{
			
				int dem=0;
				for(int j=1;j<=M[i];j++)
				{
					if(M[i]%j==0)
					{
						dem++;
					}
				}
				if(dem==2)
				{
					soNguyenTo+=M[i]+" ";
					
				}
				else
				{
					soKoNguyenTo+=M[i]+" ";
				}
			
		}
		System.out.println("Các số nguyên tố có trong dãy:\n"+soNguyenTo);
		System.out.println("Các số không phải là số nguyên tố có trong dãy là:\n"+soKoNguyenTo);
	}
		
	
		
	
	

}
