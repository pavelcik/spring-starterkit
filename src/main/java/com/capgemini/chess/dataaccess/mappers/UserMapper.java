package com.capgemini.chess.dataaccess.mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.dataacess.dto.UserDto;

public class UserMapper {

	public static UserDto getUserDtoFromUserEntity(UserEntity userEntity) {
		UserDto userDto = null;
		if(userEntity !=null) {
			userDto = new UserDto();
			userDto.setId(userEntity.getId());
			userDto.setName(userEntity.getName());
			userDto.setSurname(userEntity.getSurname());
			userDto.setEmail(userEntity.getEmail());
			userDto.setAbout_me(userEntity.getAbout_me());
			userDto.setLife_motto(userEntity.getLife_motto());
		}
		return userDto;
			}
	
	public static UserEntity getUserEntityFromUserDto(UserDto userDto) {
		UserEntity userEntity = null;
		if(userDto !=null) {
			userEntity = new UserEntity();
			userEntity.setId(userDto.getId());
			userEntity.setName(userDto.getName());
			userEntity.setSurname(userDto.getSurname());
			userEntity.setEmail(userDto.getEmail());
			userEntity.setAbout_me(userDto.getAbout_me());
			userEntity.setLife_motto(userDto.getLife_motto());
		}
		return userEntity;
			}
	
	public static List<UserDto> getUserDtoFromUserEntity(List<UserEntity> users) {
		return users.stream().map(u -> getUserDtoFromUserEntity(u)).collect(Collectors.toList());
	}
}
