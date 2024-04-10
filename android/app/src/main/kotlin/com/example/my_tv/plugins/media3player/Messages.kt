// Autogenerated from Pigeon (v18.0.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.example.my_tv.plugins.media3player

import android.util.Log
import io.flutter.plugin.common.BasicMessageChannel
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MessageCodec
import io.flutter.plugin.common.StandardMessageCodec
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer

private fun wrapResult(result: Any?): List<Any?> {
    return listOf(result)
}

private fun wrapError(exception: Throwable): List<Any?> {
    if (exception is FlutterError) {
        return listOf(
            exception.code,
            exception.message,
            exception.details
        )
    } else {
        return listOf(
            exception.javaClass.simpleName,
            exception.toString(),
            "Cause: " + exception.cause + ", Stacktrace: " + Log.getStackTraceString(exception)
        )
    }
}

/**
 * Error class for passing custom error details to Flutter via a thrown PlatformException.
 * @property code The error code.
 * @property message The error message.
 * @property details The error details. Must be a datatype supported by the api codec.
 */
class FlutterError(
    val code: String,
    override val message: String? = null,
    val details: Any? = null
) : Throwable()

/** Generated class from Pigeon that represents data sent in messages. */
data class TextureMessage(
    val textureId: Long

) {
    companion object {
        @Suppress("UNCHECKED_CAST")
        fun fromList(list: List<Any?>): TextureMessage {
            val textureId = list[0].let { if (it is Int) it.toLong() else it as Long }
            return TextureMessage(textureId)
        }
    }

    fun toList(): List<Any?> {
        return listOf<Any?>(
            textureId,
        )
    }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class PrepareMessage(
    val textureId: Long,
    val dataSource: String,
    val contentType: Long? = null,
    val playWhenReady: Boolean? = null

) {
    companion object {
        @Suppress("UNCHECKED_CAST")
        fun fromList(list: List<Any?>): PrepareMessage {
            val textureId = list[0].let { if (it is Int) it.toLong() else it as Long }
            val dataSource = list[1] as String
            val contentType = list[2].let { if (it is Int) it.toLong() else it as Long? }
            val playWhenReady = list[3] as Boolean?
            return PrepareMessage(textureId, dataSource, contentType, playWhenReady)
        }
    }

    fun toList(): List<Any?> {
        return listOf<Any?>(
            textureId,
            dataSource,
            contentType,
            playWhenReady,
        )
    }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class PlayMessage(
    val textureId: Long

) {
    companion object {
        @Suppress("UNCHECKED_CAST")
        fun fromList(list: List<Any?>): PlayMessage {
            val textureId = list[0].let { if (it is Int) it.toLong() else it as Long }
            return PlayMessage(textureId)
        }
    }

    fun toList(): List<Any?> {
        return listOf<Any?>(
            textureId,
        )
    }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class PauseMessage(
    val textureId: Long

) {
    companion object {
        @Suppress("UNCHECKED_CAST")
        fun fromList(list: List<Any?>): PauseMessage {
            val textureId = list[0].let { if (it is Int) it.toLong() else it as Long }
            return PauseMessage(textureId)
        }
    }

    fun toList(): List<Any?> {
        return listOf<Any?>(
            textureId,
        )
    }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class StopMessage(
    val textureId: Long

) {
    companion object {
        @Suppress("UNCHECKED_CAST")
        fun fromList(list: List<Any?>): StopMessage {
            val textureId = list[0].let { if (it is Int) it.toLong() else it as Long }
            return StopMessage(textureId)
        }
    }

    fun toList(): List<Any?> {
        return listOf<Any?>(
            textureId,
        )
    }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class DisposeMessage(
    val textureId: Long

) {
    companion object {
        @Suppress("UNCHECKED_CAST")
        fun fromList(list: List<Any?>): DisposeMessage {
            val textureId = list[0].let { if (it is Int) it.toLong() else it as Long }
            return DisposeMessage(textureId)
        }
    }

    fun toList(): List<Any?> {
        return listOf<Any?>(
            textureId,
        )
    }
}

@Suppress("UNCHECKED_CAST")
private object AndroidMedia3PlayerApiCodec : StandardMessageCodec() {
    override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
        return when (type) {
            128.toByte() -> {
                return (readValue(buffer) as? List<Any?>)?.let {
                    DisposeMessage.fromList(it)
                }
            }

            129.toByte() -> {
                return (readValue(buffer) as? List<Any?>)?.let {
                    PauseMessage.fromList(it)
                }
            }

            130.toByte() -> {
                return (readValue(buffer) as? List<Any?>)?.let {
                    PlayMessage.fromList(it)
                }
            }

            131.toByte() -> {
                return (readValue(buffer) as? List<Any?>)?.let {
                    PrepareMessage.fromList(it)
                }
            }

            132.toByte() -> {
                return (readValue(buffer) as? List<Any?>)?.let {
                    StopMessage.fromList(it)
                }
            }

            133.toByte() -> {
                return (readValue(buffer) as? List<Any?>)?.let {
                    TextureMessage.fromList(it)
                }
            }

            else -> super.readValueOfType(type, buffer)
        }
    }

    override fun writeValue(stream: ByteArrayOutputStream, value: Any?) {
        when (value) {
            is DisposeMessage -> {
                stream.write(128)
                writeValue(stream, value.toList())
            }

            is PauseMessage -> {
                stream.write(129)
                writeValue(stream, value.toList())
            }

            is PlayMessage -> {
                stream.write(130)
                writeValue(stream, value.toList())
            }

            is PrepareMessage -> {
                stream.write(131)
                writeValue(stream, value.toList())
            }

            is StopMessage -> {
                stream.write(132)
                writeValue(stream, value.toList())
            }

            is TextureMessage -> {
                stream.write(133)
                writeValue(stream, value.toList())
            }

            else -> super.writeValue(stream, value)
        }
    }
}

/** Generated interface from Pigeon that represents a handler of messages from Flutter. */
interface AndroidMedia3PlayerApi {
    fun initialize()
    fun create(): TextureMessage
    fun prepare(msg: PrepareMessage)
    fun play(msg: PlayMessage)
    fun pause(msg: PauseMessage)
    fun stop(msg: StopMessage)
    fun dispose(msg: DisposeMessage)

    companion object {
        /** The codec used by AndroidMedia3PlayerApi. */
        val codec: MessageCodec<Any?> by lazy {
            AndroidMedia3PlayerApiCodec
        }

        /** Sets up an instance of `AndroidMedia3PlayerApi` to handle messages through the `binaryMessenger`. */
        @Suppress("UNCHECKED_CAST")
        fun setUp(
            binaryMessenger: BinaryMessenger,
            api: AndroidMedia3PlayerApi?,
            messageChannelSuffix: String = ""
        ) {
            val separatedMessageChannelSuffix =
                if (messageChannelSuffix.isNotEmpty()) ".$messageChannelSuffix" else ""
            run {
                val channel = BasicMessageChannel<Any?>(
                    binaryMessenger,
                    "dev.flutter.pigeon.my_tv.AndroidMedia3PlayerApi.initialize$separatedMessageChannelSuffix",
                    codec
                )
                if (api != null) {
                    channel.setMessageHandler { _, reply ->
                        var wrapped: List<Any?>
                        try {
                            api.initialize()
                            wrapped = listOf<Any?>(null)
                        } catch (exception: Throwable) {
                            wrapped = wrapError(exception)
                        }
                        reply.reply(wrapped)
                    }
                } else {
                    channel.setMessageHandler(null)
                }
            }
            run {
                val channel = BasicMessageChannel<Any?>(
                    binaryMessenger,
                    "dev.flutter.pigeon.my_tv.AndroidMedia3PlayerApi.create$separatedMessageChannelSuffix",
                    codec
                )
                if (api != null) {
                    channel.setMessageHandler { _, reply ->
                        var wrapped: List<Any?>
                        try {
                            wrapped = listOf<Any?>(api.create())
                        } catch (exception: Throwable) {
                            wrapped = wrapError(exception)
                        }
                        reply.reply(wrapped)
                    }
                } else {
                    channel.setMessageHandler(null)
                }
            }
            run {
                val channel = BasicMessageChannel<Any?>(
                    binaryMessenger,
                    "dev.flutter.pigeon.my_tv.AndroidMedia3PlayerApi.prepare$separatedMessageChannelSuffix",
                    codec
                )
                if (api != null) {
                    channel.setMessageHandler { message, reply ->
                        val args = message as List<Any?>
                        val msgArg = args[0] as PrepareMessage
                        var wrapped: List<Any?>
                        try {
                            api.prepare(msgArg)
                            wrapped = listOf<Any?>(null)
                        } catch (exception: Throwable) {
                            wrapped = wrapError(exception)
                        }
                        reply.reply(wrapped)
                    }
                } else {
                    channel.setMessageHandler(null)
                }
            }
            run {
                val channel = BasicMessageChannel<Any?>(
                    binaryMessenger,
                    "dev.flutter.pigeon.my_tv.AndroidMedia3PlayerApi.play$separatedMessageChannelSuffix",
                    codec
                )
                if (api != null) {
                    channel.setMessageHandler { message, reply ->
                        val args = message as List<Any?>
                        val msgArg = args[0] as PlayMessage
                        var wrapped: List<Any?>
                        try {
                            api.play(msgArg)
                            wrapped = listOf<Any?>(null)
                        } catch (exception: Throwable) {
                            wrapped = wrapError(exception)
                        }
                        reply.reply(wrapped)
                    }
                } else {
                    channel.setMessageHandler(null)
                }
            }
            run {
                val channel = BasicMessageChannel<Any?>(
                    binaryMessenger,
                    "dev.flutter.pigeon.my_tv.AndroidMedia3PlayerApi.pause$separatedMessageChannelSuffix",
                    codec
                )
                if (api != null) {
                    channel.setMessageHandler { message, reply ->
                        val args = message as List<Any?>
                        val msgArg = args[0] as PauseMessage
                        var wrapped: List<Any?>
                        try {
                            api.pause(msgArg)
                            wrapped = listOf<Any?>(null)
                        } catch (exception: Throwable) {
                            wrapped = wrapError(exception)
                        }
                        reply.reply(wrapped)
                    }
                } else {
                    channel.setMessageHandler(null)
                }
            }
            run {
                val channel = BasicMessageChannel<Any?>(
                    binaryMessenger,
                    "dev.flutter.pigeon.my_tv.AndroidMedia3PlayerApi.stop$separatedMessageChannelSuffix",
                    codec
                )
                if (api != null) {
                    channel.setMessageHandler { message, reply ->
                        val args = message as List<Any?>
                        val msgArg = args[0] as StopMessage
                        var wrapped: List<Any?>
                        try {
                            api.stop(msgArg)
                            wrapped = listOf<Any?>(null)
                        } catch (exception: Throwable) {
                            wrapped = wrapError(exception)
                        }
                        reply.reply(wrapped)
                    }
                } else {
                    channel.setMessageHandler(null)
                }
            }
            run {
                val channel = BasicMessageChannel<Any?>(
                    binaryMessenger,
                    "dev.flutter.pigeon.my_tv.AndroidMedia3PlayerApi.dispose$separatedMessageChannelSuffix",
                    codec
                )
                if (api != null) {
                    channel.setMessageHandler { message, reply ->
                        val args = message as List<Any?>
                        val msgArg = args[0] as DisposeMessage
                        var wrapped: List<Any?>
                        try {
                            api.dispose(msgArg)
                            wrapped = listOf<Any?>(null)
                        } catch (exception: Throwable) {
                            wrapped = wrapError(exception)
                        }
                        reply.reply(wrapped)
                    }
                } else {
                    channel.setMessageHandler(null)
                }
            }
        }
    }
}
