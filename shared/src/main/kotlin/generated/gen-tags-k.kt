package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class KBD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("kbd", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

open class KEYGEN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("keygen", consumer, initialAttributes), CommonAttributeGroupFacade {
    var autoFocus : Boolean
        get()  = attributeBooleanTicker.get(this, "autofocus")
        set(newValue) {attributeBooleanTicker.set(this, "autofocus", newValue)}

    var challenge : String
        get()  = attributeStringString.get(this, "challenge")
        set(newValue) {attributeStringString.set(this, "challenge", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeStringString.get(this, "form")
        set(newValue) {attributeStringString.set(this, "form", newValue)}

    var keyType : KeyGenKeyType
        get()  = attributeKeyGenKeyTypeEnumKeyGenKeyTypeValues.get(this, "keytype")
        set(newValue) {attributeKeyGenKeyTypeEnumKeyGenKeyTypeValues.set(this, "keytype", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}


}

