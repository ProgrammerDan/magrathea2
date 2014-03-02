class Magrathea2 {
	public static void main(String[] mountain) {
		String out = "";
		char[][] output = new char[11][mountain[0].length()];
		int height = 9; int maxheight = -1;
		int position = 0;
		char left,right,up;
		char[] mount = mountain[0].toCharArray();
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
}
