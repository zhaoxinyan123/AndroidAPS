package app.aaps.core.keys

enum class StringKey(
    override val key: Int,
    val defaultValue: String,
    override val defaultedBySM: Boolean = false,
    val showInApsMode: Boolean = true,
    val showInNsClientMode: Boolean = true,
    val showInPumpControlMode: Boolean = true,
    val hideParentScreenIfHidden: Boolean = false // PreferenceScreen is final so we cannot extend and modify behavior
) : PreferenceKey {

    GeneralLanguage(R.string.key_language, "default", defaultedBySM = true),
    GeneralSkin(R.string.key_skin, ""),
    GeneralDarkMode(R.string.key_use_dark_mode, "dark", defaultedBySM = true),
}