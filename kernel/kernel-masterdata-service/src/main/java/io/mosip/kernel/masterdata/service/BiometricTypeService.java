package io.mosip.kernel.masterdata.service;

import io.mosip.kernel.masterdata.dto.BiometricTypeDto;
import io.mosip.kernel.masterdata.dto.BiometricTypeRequestDto;
import io.mosip.kernel.masterdata.dto.BiometricTypeResponseDto;
import io.mosip.kernel.masterdata.entity.BiometricType;
import io.mosip.kernel.masterdata.entity.CodeAndLanguageCodeId;

/**
 * @author Neha
 * @since 1.0.0
 */
public interface BiometricTypeService {

	/**
	 * To fetch all biometric types
	 * 
	 * @return {@linkplain BiometricTypeDto}
	 */
	public BiometricTypeResponseDto getAllBiometricTypes();
	
	/**
	 * To fetch all biometric types using language code
	 * 
	 * @param langCode
	 		the language code
	 * @return {@linkplain BiometricTypeDto}
	 */
	public BiometricTypeResponseDto getAllBiometricTypesByLanguageCode(String langCode);

	/**
	 * To fetch biometric type using id and language code
	 * 
	 * @param code
	 * @param langCode
	 * @return {@linkplain BiometricType}
	 */
	public BiometricTypeResponseDto getBiometricTypeByCodeAndLangCode(String code, String langCode);
	
	public CodeAndLanguageCodeId addBiometricType(BiometricTypeRequestDto biometricTypeRequestDto);
}
