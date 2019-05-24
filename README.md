#### Tp Java du 24 mai 2019

##### Réponse aux questions :

- **Différence entre type primitif** : ( ex : int ) et wrapper ( ex : Integer ). Notre type primitif n'a pas de méthode comme les a
le wrapper. Le type primitif prend moins de place mémoire. Le wrapper peut être rédéfini en String via l'une de ses méthodes mais peut également
avoir la valeur null alors que le type primitif ne le peut pas.

- **Public** : Est accessible partout dans l'application. Les getter et setter par exemple, sont accessibles
dans d'autres classes qui n'héritent pas forcément de cette classe.

- **Private** : N'est accessible que dans la classe elle même.

- **Protected** : Est accessible chez elle et ses enfants ( héritage )

- **Final** : Ne peut pas être instancié une nouvelle fois. Exemple : niveau = new Niveau(). Sert également à éviter 
les fuites de mémoire.

- **Static** : Permets d'appeler des méthodes d'une classe sans l'instancier.

- **Abstract** : Permets de créer une classe abstraite qui aura le comportement de ses méthodes qui seront définies dans une classe fille.

- **Interface** : Permets de palier au fait qu'on ne peut pas extends ( hériter ) de plusieurs classes. Notre interface va "distribuer" ses méthodes
aux classes qui l'implémentent. Ces classes géreront ces méthodes implémentées "chacune" chez elles.

- **New** : Permets d'instancier, de créer un nouvel objet. Exemple new Niveau() permets d'instancier la classe Niveau à travers un nouvel objet.

