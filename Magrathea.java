class Magrathea {

void n(String m){char[]n=m.toCharArray();int e=n.length,h=9,x=-1,p;char[][]o=new char[11][e];char l,r,u,s=94,t=47,v=92,w=32;boolean a,b,c;for(;h>=0;h--){for(p=0;p<e;p++){if(n[p]-49==h){o[h][p]=s;if(x==-1)x=h;}else{l=(p>0)?o[h+1][p-1]:0;r=(p<e-1)?o[h+1][p+1]:0;u=o[h+1][p];a=l==s||l==v;b=r==s||r==t;c=u<=w;o[h][p]=(a&&b)?'v':(c&&b)?t:(c&&a)?v:w;}}if(x>=h)System.out.println(o[h]);}}
	
	//abcehlmnopxu
	//dfgijkqrstuvwyz (adds 25) (saves 22)
	void m_prealt(String m){
		char[]n=m.toCharArray();
		int e=n.length,h=9,x=-1,p;
		char[][]o=new char[11][e];
		char l,r,u,s=94,t=47,v=92,w=32;boolean a,b,c;
		for(;h>=0;h--){
			for(p=0;p<e;p++){
				if(n[p]-49==h){
					o[h][p]=s;
					if(x==-1)x=h;
				}else{ 
				    l=(p>0)?o[h+1][p-1]:0;
					r=(p<e-1)?o[h+1][p+1]:0;
					u=o[h+1][p];
					a=l==s||l==v;
					b=r==s||r==t;
					c=u<=w;
					o[h][p]=(a&&b)?'v':(c&&b)?t:(c&&a)?v:w;
				}
			}
			if(x>=h)System.out.println(o[h]);
		}
	}

void m(String m){char[]n=m.toCharArray();int e=n.length,h=9,x=-1,p;char[][]o=new char[11][e];char l,r,u;boolean a,b,c;for(;h>=0;h--){for(p=0;p<e;p++){if(n[p]-49==h){o[h][p]=94;if(x==-1)x=h;}else{l=(p>0)?o[h+1][p-1]:0;r=(p<e-1)?o[h+1][p+1]:0;u=o[h+1][p];a=l>91&&l<99;b=r==94||r==47;c=u<33;o[h][p]=(char)((a&&b)?'v':(c&&b)?47:(c&&a)?92:32);}}if(x>=h)System.out.println(o[h]);}}

	void m_pre(String m){
		char[]n=m.toCharArray();
		int e=n.length,h=9,x=-1,p;
		char[][]o=new char[11][e];
		char l,r,u;boolean a,b,c;
		for(;h>=0;h--){
			for(p=0;p<e;p++){
				if(n[p]-49==h){
					o[h][p]=94;
					if(x==-1)x=h;
				}else{ 
				    l=(p>0)?o[h+1][p-1]:0;
					r=(p<e-1)?o[h+1][p+1]:0;
					u=o[h+1][p];
					a=l>91&&l<99;
					b=r==94||r==47;
					c=u<33;
					o[h][p]=(char)((a&&b)?'v':(c&&b)?47:(c&&a)?92:32);
				}
			}
			if(x>=h)System.out.println(o[h]);
		}
	}
	
	static void buildMountain(String mountain) {
		String out = "";
		char[][] output = new char[11][mountain.length()];
		int height = 9; int maxheight = -1;
		int position = 0;
		char left,right,up;
		char[] mount = mountain.toCharArray();
		for (; height >= 0; height--) {
			for (position=0; position < mount.length; position++) {
				if (mount[position]-49 == height) {
					output[height][position] = '^';
					if (maxheight==-1) {
						maxheight=height;
					}
				} else { // deal with non-numbers as '.'
				    left=(position>0)?output[height+1][position-1]:0;
					right=(position<mount.length-1)?output[height+1][position+1]:0;
					up=output[height+1][position];
					if ((left=='^'||left=='\\')&&(right=='^'||right=='/')) {
						output[height][position]='v';
					} else if ((up==' '||up==0)&&(right=='/'||right=='^')) {
						output[height][position]='/';
					} else if ((up==' '||up==0)&&(left=='\\'||left=='^')) {
						output[height][position]='\\';
					} else {
						output[height][position]=' ';
					}
				}
			}
			if (maxheight >= height) {
				out+=new String(output[height]);
				if (height > 0) {
					out+="\n";
				}
			}
		}
		System.out.println(out);
	}

	public static void main(String[] args) {
		if (args.length != 0) {
			Magrathea.buildMountains(args);
		} else {
			String[] mountains = {
				"1",
				"11",
				"1.2.",
				".2.3..",
				".2..3..",
				"...4...3...3..",
				"........9........",
				"........9........4...",
				".......8.......",
				".2.....6.....5...3......1..3..4....2."
			};
			Magrathea.buildMountains(mountains);
		}
	}
	public static void buildMountains(String[] mountainMaps) {
		Magrathea mag = new Magrathea();
		for (String s : mountainMaps) {
			System.out.println(s);
			Magrathea.buildMountain(s);
			mag.m(s);
			mag.n(s);
		}
	}
}
