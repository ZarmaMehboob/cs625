class Queue {
int putloc getloc;
Queue (int size){
q = new Char[size];
putloc = getloc = 0;
}
void put (Char Ch) {
if(putloc==q.length){
System.out.println(" -Queue is full."}
return;
}