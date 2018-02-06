# RageMP + Kotlin + Autocomplete = ❤
### Installation ⚙

- Download the latest release build
- Add it to your Kotlin JavaScript project
- Enjoy the type safety of Kotlin inside of RageMP!

### Getting Started with Development 🔰
I have created a GitHub repo that includes an example project as
well as a build script to help everyone out for faster development.

You can check it out right [here](https://github.com/LucasRitter/RageMP-Kotlin-Example). 😎

But if you want to set it up yourself, just follow the installation
guide at the top of the readme.

### Differences to the official JavaScript library 🤔
- Vector3 and Quaternion are called with normal constructors:
    ```kotlin
    var position = MpVector3(0, 0, 0)
    var quat = MpQuaternion(0, 0, 0, 0)
    ```
- Additional options for `MpVehicle` or `MpBlip` creation are
  handled as objects of the same name with the `Options` suffix.
  They still include all optional parameters:
    ```kotlin
    var vehicle = mp.vehicles.new(
        mp.game.joaat("infernus"),
        mp.players.local.position,
        MpVehicleOptions(
            numberPlate = "Kotlin",
            color = arrayOf(arrayOf(220, 52, 40), arrayOf(220, 52, 40)),
            heading = 270
        ))
    ```
- Events and their respective arguments are passed as an `Array<Any>` type
  so if you want to use them in your code and you want to keep everything
  as neatly organized as possible:
    ```kotlin
    fun firstFunction() {
      mp.events.add("eventName", { args -> this.onEventName(args) })
      mp.events.add("eventNameNoArgs", { this.onEventNameNoArgs() })
    }
    
    fun onEventName(args: Array<Any>?) {
      // Do whatever you want with the arguments.
    }
    
    fun onEventNameNoArgs() {
      // Do whatever you want without any arguments.
    }
    ```
