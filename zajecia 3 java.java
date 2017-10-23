class single
{
private static single = null;
private static single = new single(); // opcja zielona

public static Single getInstance()
{
if(single==null)
single = new Single(); // opcja A;
return Single // opcja B

return single;

opcja B LAZY // tworzymy tylko przy tworzeniu programu
opcja A // gdy odwolujemy sie do instancji



}

}