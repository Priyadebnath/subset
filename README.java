# subset
int arr[]=new int[n];
int i,j,temp,set;
for(i=0;i<arr.length;i++)
{
arr[i]=scn.nextInt();
}
limit=Math.pow(2,arr.length);
for(i=0;i<limit;i++)
String set ="";
int temp =i;
for(j=arr.length-1;j>=0;j--){
r=temp%2;
temp=temp/2;
if(r==0){
set="\t"+set;
}
else
{
set=arr[j]+"\t"+set;
}
System.out.println(set);
}
