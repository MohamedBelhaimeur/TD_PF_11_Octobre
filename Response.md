#Question 1)

String::lowercase est fonctionnel car deterministe , pure par pas effet de bord ,total pas dexception
la fonction lowercase est appelé qua partir dun string et renverra tj un string pour un string donné

Math::max, Math::sin sont fonctionnels 
 
List::add nest pas fonctionnel
 
List::size est fonctionnel car peu importe le nombre de fois on renvoie tj la meme taille, pas de changement

List::contains peut avoir des exception donc pas fonctionnel

Integer::valueOf si la chaine de caractere ne peut pas etre transformer en entré (exception)

File::length car il ya entré/sortie avec les exceptions IO


m1 est pas fonctionnel car effet de bord 
m2 est fonctionnel 
m3 entré/sortie pas fonctionel IO
m4 est fonctionnel pas dexception pas de changement detat , tj les memes sortie
m5 est fonctionnel si a nest pas changé si a est vu comme une constante (question dinterpretation)
m6 est fonctionnel si b nest pas changé si b est vu comme une constante (question dinterpretation)
m7 est clairement fonctionnel , utilise uen constante 
m8 est fonctionnel mais attention si one donne n moyen de modifier d , elle ne sera plus une exception 
m9 nest pas fonctionnel (division par 0) exception
m10 est fonctionnel renverra pas une sception mais not a number pour division par 0
m11 fonctionnel retournera tj la meme chose pour une entré donné
 
 