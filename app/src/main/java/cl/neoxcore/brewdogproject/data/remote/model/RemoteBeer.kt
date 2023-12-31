package cl.neoxcore.brewdogproject.data.remote.model

data class RemoteBeer(
    val abv: Double,
    val attenuation_level: Double,
    val boil_volume: RemoteBoilVolume,
    val brewers_tips: String,
    val contributed_by: String,
    val description: String,
    val ebc: Double,
    val first_brewed: String,
    val food_pairing: List<String>,
    val ibu: Double,
    val id: Int,
    val image_url: String,
    val ingredients: RemoteIngredients,
    val method: RemoteMethod,
    val name: String,
    val ph: Double,
    val srm: Double,
    val tagline: String,
    val target_fg: Double,
    val target_og: Double,
    val volume: RemoteVolume
)