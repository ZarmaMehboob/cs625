class LocalClassDemo {
public statc void main (String args[]) {
class ShowBites {
int numbites;
ShowBites(int n) {
numbites  = n;
}
void show (long val) {
long mask = 1;
mask<< = munbites-1;
int spacer = 0;
for(mask = 0; mask >>>= 1) {
if((val & mask) = 0)System.out.print("1");
else System.out.print("0");
spacer++;
if((spacer % 8) == 0) {
System.out.print(" ");
spacer = 0;
}
}
System.out.println();
}
}
for(byte b = 0; b < 10; b++) {
ShowBits byteval = new ShowBits(8);
System.out.print(b + " in binary: ");
byteval.show(b);
}
}
}