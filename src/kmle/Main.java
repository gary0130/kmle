package kmle;

import java.util.Scanner;

public class Main {

	static int times=9583;
	static String rpoint[]=new String[times],npoint[]=new String[3],mpoint[]=new String[times];
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Scanner tin= new Scanner(System.in);
		for (int i=0;i<times;i++)
		{
			rpoint[i]=tin.nextLine();
			npoint=rpoint[i].split(",");
			mpoint[i]="<Placemark><name>"+npoint[0]+"</name><styleUrl>#placemark-blue</styleUrl><description></description><Point><coordinates>"
					+ npoint[2]+","+npoint[1]+",0"+"</coordinates></Point></Placemark>";
		}
		
		System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?> \n <kml xmlns=\"http://www.opengis.net/kml/2.2\">");
		System.out.println(" <Folder>");
		for (int i=0;i<times;i++)
		{
			System.out.println(mpoint[i]);
		}
		System.out.println(" </Folder>");
		System.out.println("</kml>");
	}

}
