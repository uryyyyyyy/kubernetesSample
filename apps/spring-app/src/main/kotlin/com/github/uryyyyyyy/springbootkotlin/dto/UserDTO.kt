package com.github.uryyyyyyy.springbootkotlin.dto

import javax.validation.constraints.Min
import javax.validation.constraints.Max
import javax.validation.constraints.NotNull

data class UserDTO(val id: Int, val name: String, val age: Int)

class CreateUserDTO constructor(
    @field:NotNull(message = "名前入れてね")
    var name: String?,

    @field:Min(0, message = "0歳〜100歳で入力してください")
    @field:Max(100, message = "0歳〜100歳で入力してください")
    @field:NotNull(message = "年齢は入れてね")
    var age: Int?){
  constructor() : this(null, null) // for jackson
}

class UpdateUserDTO constructor(
    var name: String?,

    @field:Min(0, message = "0歳〜100歳で入力してください")
    @field:Max(100, message = "0歳〜100歳で入力してください")
    var age: Int?){
  constructor() : this(null, null) // for jackson
}
