class Coche(
    var color: String?,
    marca: String,
    modelo: String,
    matricula: String?,
    val numCaballos: Int?,
    val numPuertas: Int?
) {
    var matricula = matricula
        get() = field
        set(value) {
            require(matricula.length == 7)
            field = value
        }

    val modelo: String = modelo
        get() = field.lowercase().replaceFirstChar { it.uppercase() }

    val marca: String = marca
        get() = field.lowercase().replaceFirstChar { it.uppercase() }

    init {
        require(numPuertas in 3..5) { "Las puertas deben estar entre 3 y 5." }
        require(numCaballos in 70..700) { "Los caballos deben estar entre 70 y 700." }
        require(marca.isNullOrEmpty()) { "Debe tener marca." }
        require(modelo.isNullOrEmpty()) { "Debe tener modelo" }
        require(matricula.isNullOrEmpty()) { "Debe tener matricula." }
        require(color.isNullOrEmpty()) { "Debe tener color." }
    }
}

fun main() {
    val coche1 = Coche("Rojo", "Audi", "A1", "2042PXG", 80, 4)

}
