//Exercise
//Explicitly declare the correct type for each variable:
/*fun main(){
    val a: Int=1000
    val b: String="log message"
    val c: Double=3.14
    val d: Long=100_000_000
    val e: Boolean=false
    val f: Char='\n'
}
 */






//Collections-Coleções
/*O Kotlin possui as seguintes coleções para agrupar itens:
-Listas (Lists)	Coleções ordenadas de itens.
-Conjuntos (Sets)	Coleções não ordenadas de itens únicos.
-Mapas (Maps)	Conjuntos de pares chave-valor,
onde as chaves são únicas e mapeiam para apenas um valor.
Cada tipo de coleção pode ser mutável ou somente leitura.
 */

//List - lista
/*
-para criar uma lista de leitura/constante(List), usa a função listOf()
-para criar uma lista mutável (MutableList),
usa a função mutableListOf()

para declarar o tipo de lista explicitamente é usado <>

lista tem funções como:
-.first() - para mostrar o primeiro item
-.last() - mostra o ultimo
-.count() - conta os itens
- operador in - para ver se o item existe
-.add()- adiciona um item
-.remove() - para remover um item
 */
// exemplos
/*
fun main(){
    //lista constante
    val readOnlyShapes= listOf("triangle","square","circle")
    println(readOnlyShapes)

    //lista mutável e com tipo explicito
    val shapes: MutableList<String> = mutableListOf("triangle" ,
        "square","circle")
    println(shapes)
}
 */
//listas sao ordenadas, para acessar um item da lista, usa-se []
/*fun main(){
    val readOnlyShapes = listOf("triangle", "square", "circle")
    var cont: Int =0
    for(i in readOnlyShapes){
        print("o $cont º item é $i ")
        cont+=1
    }
    println("The first item in the list is: ${readOnlyShapes[0]}")
}
 */

//first e last
/*
 fun	main()	{
    val	readOnlyShapes	=	listOf("triangle",	"square",	"circle")
    println("The	first	item	in	the	list	is:	${readOnlyShapes.first()}")
    //	The	first	item	in	the	list	is:	triangle
 }
*/
 //count
/*
fun	main()	{
    val	readOnlyShapes	=	listOf("triangle",	"square",	"circle")
    println("This	list	has	${readOnlyShapes.count()}	items")
    //	This	list	has	3	items
}
 */
 //in
 /*
fun	main()	{
    val	readOnlyShapes	=	listOf("triangle",	"square",	"circle")
    println("circle"	in	readOnlyShapes)
    //	true
}
*/

//add e remove
/*
fun	main()	{
    val	shapes:	MutableList<String>	=	mutableListOf("triangle",	"square",	"circle")
    //	Add	"pentagon"	to	the	list
    shapes.add("pentagon")
    println(shapes)
    //	[triangle,	square,	circle,	pentagon]
    //	Remove	the	first	"pentagon"	from	the	list
    shapes.remove("pentagon")
    println(shapes)
    //	[triangle,	square,	circle]
 }
 */

//Set - conjunto
/*
Enquanto as listas são ordenadas e permitem itens duplicados,
os conjuntos (sets) são desordenados e armazenam apenas itens únicos.

-Para criar um conjunto somente leitura (Set), use a função setOf().
-Para criar um conjunto mutável (MutableSet),
use a função mutableSetOf().

os Set também tem funções como:
-.count()
-operador in
-.add()
-.remove()
 */
/*
fun	main()	{
    //	Read-only	set
    val	readOnlyFruit	=	setOf("apple",	"banana",	"cherry",	"cherry")
    //	Mutable	set	with	explicit	type	declaration
    val	fruit:	MutableSet<String>	=	mutableSetOf("apple",	"banana",	"cherry",	"cherry")
    println(readOnlyFruit)
    //	[apple,	banana,	cherry] ele n mostra itens repetidos
    println(fruit)
}
 */

//.count()
/*
fun main(){
    val readFruit = setOf("apple", "banana", "orange", "pear")
    println("Esse conjunto tem ${readFruit.count()} itens" )
}
 */

//in
/*
fun main(){
    val readFruit = setOf("apple", "banana", "orange", "orange")
    println("banana" in readFruit)
}
*/

//.add() e .remove()
/*
fun main(){
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "orange", "orange")
    fruit.add("cherry")
    println(fruit)

    fruit.remove("cherry")
    println(fruit)
}
 */



//Map
/*Os Maps armazenam itens como pares chave-valor.
Você acessa o valor referenciando a chave.

Você pode imaginar um Map como um cardápio de comida:
é possível encontrar o preço (valor) localizando
o prato (chave) que deseja comer.

Os Maps são úteis quando você precisa procurar um valor
sem usar um índice numérico, como em uma lista.

Para criar um Map somente leitura (Map), use a função mapOf().
Para criar um Map mutável (MutableMap), use a função mutableMapOf().

Para declarar os tipos explicitamente,
adicione os tipos em < > após a declaração do Map.
exemplo: MutableMap<String, Int>
*/
fun main(){
    //contante
}
/*
fun main(){
    val tabuleiro: MutableMap<Int, String> = mutableMapOf(
        1 to "",
        2 to ""
    )
    tabuleiro[1] = "O"
    println(tabuleiro)
}
 */