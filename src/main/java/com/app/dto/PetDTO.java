package com.app.dto;

import java.util.Objects;

public class PetDTO {
	private Long id;
	private Long memberId;
	private String petKind;
	private String petImage;
	private String petName;
	private boolean petGender;
	private String petBreed;
	private String petBirth;
	private String petVet;
	private double petWeight;
	private boolean petNeuter;
	private String memberEmail;
	
	public PetDTO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getPetKind() {
		return petKind;
	}

	public void setPetKind(String petKind) {
		this.petKind = petKind;
	}

	public String getPetImage() {
		return petImage;
	}

	public void setPetImage(String petImage) {
		this.petImage = petImage;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public boolean getPetGender() {
		return petGender;
	}

	public void setPetGender(boolean petGender) {
		this.petGender = petGender;
	}

	public String getPetBreed() {
		return petBreed;
	}

	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}

	public String getPetBirth() {
		return petBirth;
	}

	public void setPetBirth(String petBirth) {
		this.petBirth = petBirth;
	}

	public String getPetVet() {
		return petVet;
	}

	public void setPetVet(String petVet) {
		this.petVet = petVet;
	}

	public double getPetWeight() {
		return petWeight;
	}

	public void setPetWeight(double petWeight) {
		this.petWeight = petWeight;
	}

	public boolean isPetNeuter() {
		return petNeuter;
	}

	public void setPetNeuter(boolean petNeuter) {
		this.petNeuter = petNeuter;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	@Override
	public String toString() {
		return "PetDTO [id=" + id + ", memberId=" + memberId + ", petKind=" + petKind + ", petImage=" + petImage
				+ ", petName=" + petName + ", petGender=" + petGender + ", petBreed=" + petBreed + ", petBirth="
				+ petBirth + ", petVet=" + petVet + ", petWeight=" + petWeight + ", petNeuter=" + petNeuter
				+ ", memberEmail=" + memberEmail + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PetDTO other = (PetDTO) obj;
		return Objects.equals(id, other.id);
	}
	
}