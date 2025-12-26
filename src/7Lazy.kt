class SingletonLazy private constructor() {

    companion object {
        val instance: SingletonLazy by lazy {
            SingletonLazy()
        }
    }
}
