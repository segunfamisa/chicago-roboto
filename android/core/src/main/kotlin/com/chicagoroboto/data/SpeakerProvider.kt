package com.chicagoroboto.data

import com.chicagoroboto.model.Speaker

interface SpeakerProvider {
    fun addSpeakerListener(key: Any, onComplete: (speakers: Map<String, Speaker>?) -> Unit)
    fun addSpeakerListener(id: String, onComplete: (speaker: Speaker?) -> Unit)
    fun removeSpeakerListener(key: Any)
}