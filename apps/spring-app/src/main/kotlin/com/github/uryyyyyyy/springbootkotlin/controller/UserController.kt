package com.github.uryyyyyyy.springbootkotlin.controller

import com.github.uryyyyyyy.springbootkotlin.dto.CreateUserDTO
import com.github.uryyyyyyy.springbootkotlin.dto.UpdateUserDTO
import com.github.uryyyyyyy.springbootkotlin.dto.UserDTO
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletResponse
import javax.validation.Valid

@RestController
@RequestMapping("/user")
class UserController {

  @PostMapping("/")
  fun createUser(@RequestBody @Valid dto: CreateUserDTO): UserDTO {
    return UserDTO(id = 1, name = dto.name!!, age = dto.age!!)
  }

  @GetMapping("/{id}")
  fun getUser(@PathVariable("id") id: Int): UserDTO {
    return UserDTO(id = id, name = "Bob", age = 20)
  }

  @PutMapping("/{id}")
  fun updateUser(@PathVariable("id") id: Int, @RequestBody @Valid dto: UpdateUserDTO): UserDTO {
    var targetDTO = UserDTO(id = id, name = "Bob", age = 20)
    if (dto.age != null) {
      targetDTO = targetDTO.copy(age = dto.age!!)
    }
    if (dto.name != null) {
      targetDTO = targetDTO.copy(name = dto.name!!)
    }
    return targetDTO
  }

  @DeleteMapping("/{id}")
  fun deleteUser(@PathVariable("id") id: Int, res: HttpServletResponse): String {
    res.status = 204
    res.addHeader("hoge", "fuga")
    return ""
  }

}
