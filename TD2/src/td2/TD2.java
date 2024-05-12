
package td2;

public class TD2 {

 
    public static void main(String[] args) {
      Personne p = new Personne("louis","Ville",25); 
      Personne c = new Personne("louanne","Village",61);
      Personne d = new Personne("marc", "cite", 12);
      
      Personne[] per = {p,c,d};
      /*
      for (type element : collection) {
         // Instructions à exécuter pour chaque élément
       }
      type : Le type des éléments de la collection.
        element : Une variable qui prendra la valeur de chaque 
        élément de la collection à chaque itération.
        collection : La collection ou le tableau que vous souhaitez parcourir.
        Personne est le type des éléments de la collection personnes.
        personne est la variable qui prendra la valeur de chaque élément 
        de personnes à chaque itération
        Ainsi, à chaque itération de la boucle, personne contiendra
        une référence à un objet Personne dans le tableau personnes, 
        ce qui vous permet d'accéder directement aux méthodes et aux champs
        de cet objet. Cela rend le code plus lisible et évite d'avoir à gérer 
        manuellement les indices.
      */
      /*for(Personne personne:per ){
          System.out.println("Nom :"+ personne.getNom());
          System.out.println("Adresse "+personne.getAdresse());
          System.out.println("Catégorie d'âge: "+ personne.categorieDAge());
          System.out.print("Catégorie de résidence: ");
          personne.categorieDeResidence();
          System.out.println("");
      }*/
      // OU
        for (int i = 0; i < per.length; i++) {
            System.out.println("Nom :" + per[i].getNom());
            System.out.println("Adresse "+per[i].getAdresse());
            System.out.println("Catégorie d'âge: "+ per[i].categorieDAge());
            System.out.print("Catégorie de résidence: ");
            per[i].categorieDeResidence();
            System.out.println("");
        }
      
      int[] tab = p.monTab();
        System.out.println(" éléments mdodifiés du tableau ");
        for (int i = 0; i < 4; i++) {
            System.out.println(" éléement à l'index " + i+ ":"+ tab[i]);
        }
    }
    
    
}
