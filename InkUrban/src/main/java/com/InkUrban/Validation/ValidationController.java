package com.InkUrban.Validation;

import org.springframework.stereotype.Component;

@Component
public class ValidationController {


	public String image_MSG = "Screen Shot/Pdf name Should Contain Maximum 255 Characters";
	public Boolean checkImageAnmlLength(String fname) {
		if(fname.length() > 255) {
   	    	return false;
   	    }else {
   	    	return true;
   	    }
    }
	
//***************************************************START HELPDESK***************************************************************//	
   public String DescriptionLengthHelpdeskMSG = "Description Should Contain Maximum 1000 Character.";
    public boolean checkDescriptionLengthHelpdeskLength(String description) {
        if(description.length() >1000) {
               return false;
       }else {
               return true;
       }
    }
 
    public String Issue_summaryHelpdeskMSG = "Issue Summary Should Contain Maximum 100 Character.";
    public boolean checkIssue_summaryHelpdeskLength(String issue_summary) {
        if(issue_summary.length() >100) {
               return false;
       }else {
               return true;
       }
    }
    
    public String agent_nameHelpdeskMSG = "Agent Name Should Contain Maximum 30 Character.";
    public boolean checkagent_nameHelpdeskLength(String agent_name) {
        if(agent_name.length() >30) {
               return false;
       }else {
               return true;
       }
    }
    
    public String sectionHelpdeskMSG = "Section Should Contain Maximum 20 Character.";
    public boolean checksectionHelpdeskLength(String section) {
        if(section.length() >20) {
               return false;
       }else {
               return true;
       }
    }
    
    public String questionHelpdeskMSG = "Question Should Contain Maximum 255 Character.";
    public boolean checkquestionHelpdeskLength(String question) {
        if(question.length() >255) {
               return false;
       }else {
               return true;
       }
    }
    
    public String msgMarqueeMSG = "MSG Should Contain Maximum 200 Character.";
    public boolean checkmsgMarqueeLength(String msg) {
        if(msg.length() >200) {
               return false;
       }else {
               return true;
       }
    }
  //***************************************************END HELPDESK***************************************************************//
    
//***************************************************START LOGIN***************************************************************//
    
    public String ModuleNameMSG = "Module Name Should Contain Maximum 20 Character.";
    public boolean ModuleNameLength(String module_name) {
        if(module_name.length() >20) {
               return false;
       }else {
               return true;
       }
    }
    
    
    
    public String SubModuleNameMSG = "Sub Module Name Should Contain Maximum 255 Character.";
    public boolean SubModuleNameLength(String submodule_name) {
        if(submodule_name.length() >255) {
               return false;
       }else {
               return true;
       }
    }
    
    
    public String ScreenNameMSG = "Screen Name Should Contain Maximum 80 Character.";
    public boolean ScreenNameLength(String screen_name) {
        if(screen_name.length() >80) {
               return false;
       }else {
               return true;
       }
    }
    
    public String ScreenURLMSG = "Screen Url Should Contain Maximum 125 Character.";
    public boolean ScreenURLLength(String screen_url) {
        if(screen_url.length() >125) {
               return false;
       }else {
               return true;
       }
    }
    
    public String RoleMSG = "Role Should Contain Maximum 45 Character.";
    public boolean RoleLength(String role) {
        if(role.length() >45) {
               return false;
       }else {
               return true;
       }
    }    
    
    public String LoginNameMSG = "Login Name Should Contain Maximum 70 Character.";
    public boolean LoginNameLength(String login_name) {
        if(login_name.length() > 70) {
               return false;
       }else {
               return true;
       }
    }
    
    public String UserNameMSG = "User Name Should Contain Maximum 30 Character.";
    public boolean UserNameLength(String user_name) {
        if(user_name.length() > 30) {
               return false;
       }else {
               return true;
       }
    }
    
    
    
    public String PasswordMSG = "Password Should Contain 8 to 28 Character.";
    public boolean PasswordLength(String password) {
        if(password.length() < 8 & password.length() > 28) {
               return false;
       }else {
               return true;
       }
    }
    
    public String PasswordPatternMSG = "Password Should Contain at least one number and one uppercase and lowercase letter and special character";
    //***************************************************END LOGIN***************************************************************//
    
    
    public String isOnlyAlphabetMSG = "Must Be Contain Only Alphabet ";
   	public boolean isOnlyAlphabet(String str) {
   		if (str.matches("^[a-zA-Z\\s]*$")) {
   			return true;
   		} else {
   			return false;
   		}
   	}
   	
   	
   	public String isOnlyNumerMSG = "Must Be Contain Only Digit ";
	public boolean isOnlyNumer(String str) {
		if (str.matches(".*[^0-9].*")) {
			return true;
		} else {
			return false;
		}
	} 
	
	
	public String isOnlyMobilenumberMSG = "Number Start with 6,7,8,9 Digit";

	public boolean isValidMobileNo(String str) {
		if (str.length() == 10) {
			
			if (Integer.parseInt(str.substring(0, 1)) >= 6 && Integer.parseInt(str.substring(0, 1)) < 10) {
			
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
		
		public String MaxlengthcheckMSG = "Should be less then 250 Characters. ";
		public boolean maxlengthcheck(String str) {
		
			if (str.trim().length() > 250) {
				return false;
			} else {
				return true;
			}
		}
		
		
	    public String isOnlyAlphabetMSGDASH = " Must Be Contain Only Alphabet ";
	   	public boolean isOnlyAlphabetDASH(String str) {
	   		if (str.matches("^[a-zA-Z\\s-,&]*$")) {
	   			return true;
	   		} else {
	   			return false;
	   		}
	   	}
	    public String isOnlyAlphabetNUMSGDASH = " Must Be Contain Only Alphabet ";
	   	public boolean isOnlyAlphabetnumDASH(String str) {
	   		if (str.matches("^[a-zA-Z0-9/\\s]*$")) {
	   			return true;
	   		} else {
	   			return false;
	   		}
	   	}
	   	
		public String MaxlengthcheckMSG5 = "Should be less then 5 Characters. ";

		public boolean maxlengthcheck5(String str) {
			if (str.trim().length() > 5) {
				return false;    
			} else {
				return true;
			}
		}

		
		
		public String MaxlengthcheckMSG50 = "Should be less then 50 Characters. ";

		public boolean maxlengthcheck50(String str) {
			if (str.trim().length() > 50) {
				return false;
			} else {
				return true;
			}
		}
		public String MaxlengthcheckMSG30 = "Should be less then 30 Characters. ";
		public boolean maxlengthcheck30(String str) {
		
			if (str.trim().length() > 30) {
				return false;
			} else {
				return true;
			}
		}


		public String isOnlyNumerMSG1to9 = " Contain Only 1 to 9 Digit ";
		public boolean isOnlyNumer1to9(String str) {
			if (str.matches(".*[^1-9].*")) {
				return true;
			} else {
				return false;
			}
		} 


		public String MaxlengthcheckMSG1 = "Should be 1 Characters. ";

		public boolean maxlengthcheck1(String str) {
			
			if (str.trim().length() >= 1) {
				return false;    
			} else {
				return true;
			}
		}

			public String MaxlengthcheckMSGforheight = "Should be  3 Characters. ";
			public boolean maxlengthcheckheight(String str) {
			
				if (str.trim().length() > 3) {
					return false;
				} else {
					return true;
				}
			}
			
			public String MaxlengthcheckMSGforCHEST = "Should be  2 Characters. ";
			public boolean maxlengthcheCHEST(String str) {
			
				if (str.trim().length() > 2) {
					return false;
				} else {
					return true;
				}
			}
			
			public String MaxlengthcheckMSGpincode = "Should not be more then 6 Characters. ";
			public boolean maxlengthcheckpincode(String str) {
			
				if (str.trim().length() > 6) {
					return false;
				} else {
					return true;
				}
			}
			
			public String MinlengthcheckMSGpincode = "Should not be less then 6 Characters. ";
			public boolean minlengthcheckpincode(String str) {
			
				if (str.trim().length() < 6) {
					return false;
				} else {
					return true;
				}
			}
			
			
			public String MaxlengthcheckMSGforcenumber = "Should be less then 10 Characters. ";
			public boolean maxlengthcheckforceno(String str) {
			
				if (str.trim().length() >= 10) {
					return false;
				} else {
					return true;
				}
			}
			
			public String MaxlengthcheckMSG2 = "Should be 2 Digit. ";

			public boolean maxlengthcheck2(String str) {
				
				if (str.trim().length() > 2) {
					
					return false;    
				} else {
					
					return true;
				}
			}
			
			

			public String MaxlengthcheckMSG10 = "Should be 10 Characters. ";

			public boolean maxlengthcheck10(String str) {
				
				if (str.length() > 10) {
					
					return false;    
				} else {
					
					return true;
				}
			}
			
			
			public String isOnlyAlphabetNumberMSG = " Must Be Contain Only Alphabet and Number ";
		   	public boolean isOnlyAlphabetNumber(String str) {
		   
		   		if (str.matches("^[a-zA-Z0-9\\s]*$")) {
		   			return true;
		   		} else {
		   			return false;
		   		}
		   	}
		   	
		   	
		   	public String MaxlengthcheckMSGC = " Should be less then 4 Digit. ";
			public boolean maxlengthcheckC(String str) {
			
				if (str.trim().length() >= 4) {
					return false;
				} else {
					return true;
				}
			}
			
			public String MaxlengthcheckMSG1D = " Should be 1 Digit. ";
			public boolean maxlengthcheck1D(String str) {
				
				if (str.trim().length() > 1) {
					return false;    
				} else {
					return true;
				}
			}
			
			
			public String MaxlengthcheckMSG100 = "Should be less then 100 Characters. ";
			public boolean maxlengthcheck100(String str) {
			
				if (str.trim().length() > 100) {
					return false;
				} else {
					return true;
				}
			}
			
		
			public String MaxlengthcheckMSG15 = "Should be less then 15 Characters. ";

			public boolean maxlengthcheck15(String str) {
				if (str.trim().length() > 15) {
					return false;
				} else {
					return true;
				}
			}	

			//dynamic max length
			public String Maxlengthcheck = "Characters Should be less then. ";

			public boolean maxlengthcheckMSG(String str,int maxLength) {
				if (str.trim().length() > maxLength) {
					return false;
				} else {
					return true;
				}
			}
    
/////////////mirangi_22_6_22
			public String MaxlengthcheckMSG70 = "Should be less then 70 Characters. ";
			public boolean maxlengthcheck70(String str) {
				if (str.trim().length() > 70) {
					return false;
				} else {
					return true;
				}
			}
			
			public String AadhaarNoMSG = "Should Contain Maximum 12 Digit. ";
			public boolean AadhaarNoLength_12(String str) {
			
				if (str.trim().length() >= 12) {
					return false;
				} else {
					return true;
				}
			}
			
			public String isOnlyAlphabetNumericMSG = "Must Be Contain Only Numbers & Alphabet ";
			public boolean isOnlyAlphabetNumeric(String str) {
				if (str.matches("^[0-9a-zA-Z\\s]*$")) {
					return true;
				} else {
					return false;
				}
			}
			 public String AadharNoMSG11 = "Aadhaar Number Should Contain Maximum 4 Digit. ";

				public boolean AadharNoLength(String str) {
					if (str.length() > 4) {
						return false;
					} else {
						return true;
					}
				}

			public String AadharNoMSGMinlen11 = "Aadhaar Number Should Contain Minimum 4 Digit. ";
			public boolean AadharNoMinLength(String str) {
					if (str.length() < 4) {
						return false;
					} else {
						return true;
					}
				}
				
			 public String AadharNoMSG21 = "Aadhaar Number Should Contain Maximum 4 Digit. ";
			 public boolean AadharNoLength21(String str) {
						if (str.length() > 4) {
							return false;
						} else {
							return true;
						}
					}
					
			 public String AadharNoMinlenMSG21 = "Aadhaar Number Should Contain Minimum 4 Digit. ";
			 public boolean AadharNoMinLength21(String str) {
						
						if (str.length() < 4) {
							return false;
						} else {
							return true;
						}
					}
					
			 public String AadharNoMSG3 = "Aadhar Number Should Contain Maximum 4 Digit. ";
			 public boolean AadharNoLength3(String str) {
							
							if (str.length() > 4) {
								return false;
							} else {
								return true;
							}
						}
				
			 public String AadharNoMinlenMSG3 = "Aadhaar Number Should Contain Minimum 4 Digit. ";
			 public boolean AadharNoMinLength3(String str) {
								
								if (str.length() < 4) {
									return false;
								} else {
									return true;
								}
							}
				
			 public String AadharNoMSG2 = "Aadhaar No Should Contain Maximum 4 Digit and 0000 not supported. ";
			 public boolean AadharNoLength2(String str) {
			
				if(str.trim().equals("0000")) {
					return false;
				}else {
					return true;
					} 
			 	}
			 
			 public String MaxlengthMSG10 = "Should Contain Maximum 10 Characters. ";
				public boolean maxlength10(String str) {
					
					if (str.length() > 10) {
						return false;    
					} else {
						return true;
					}
				}
				
				public String MinlengthMSG10 = "Should Contain Minimum 10 Characters. ";
				public boolean minlength10(String str) {
					
					if (str.length() < 10) {
						return false;    
					} else {
						return true;
					}
				}
				
				public String MaxlengthcheckMSGneetrank6 = "Should Contain Maximum 6 Characters. ";
				public boolean maxlengthcheckneetrank(String str) {
					if (str.trim().length() > 6) {
						return false;
					} else {
						return true;
					}
				}
				
				public String MaxlengthcheckMSGneetmark3 = "Should Contain Maximum 3 Characters. ";
				public boolean maxlengthcheckneetmark(String str) {
					if (str.trim().length() > 3) {
						return false;
					} else {
						return true;
					}
				}
				
				public String MaxlengthcheckMSGneetpercentile5 = "Should Contain Maximum 5 Characters.";
				public boolean maxlengthcheckneetpercentile(String str) {
					if (str.trim().length() > 5) {
						return false;
					} else {
						return true;
					}
				}
				public String MaxlengthcheckMSGneetallindiarank7 = "Should Contain Maximum 7 Characters. ";
				public boolean maxlengthcheckneetindiarank(String str) {
					if (str.trim().length() > 7) {
						return false;
					} else {
						return true;
					}
				}
				
			 	public String isOnlyNumerMSGLib = "Must Be Contain Only Digit ";
				public boolean isOnlyNumerLib(String str) {
					if (str.matches("[0-9]+")) {
						return true;
					} else {
						return false;
					}
				} 
				
			 	public String Maxlengthcheck3MSG = " Should be less then 3 Digit. ";
				public boolean maxlengthcheck3digit(String str) {
				
					if (str.trim().length() > 3) {
						return false;
					} else {
						return true;
					}
				}
				//---------------------------------------------FAX No---------------------------------------------------------		
				
				public String MaxlengthcheckMSGforFaxnumber = "Should be less then 15 Characters. ";
				public boolean maxlengthcheckforfaxno(String str) {
				
					if (str.trim().length() >= 15) {
						return false;
					} else {
						return true;
					}
				}
				public String MaxlengthcheckMSGF = "Should be 15 Characters. ";

				public boolean maxlengthcheckF(String str) {
					
					if (str.length() > 15) {
						
						return false;    
					} else {
						
						return true;
					}
				}
				
				
				
				 public String AddressMSG = " Must Be Contain Only Alphabet ";
				   	public boolean addressMSG(String str) {
				   		if (str.matches("^[a-zA-Z0-9/,-.\\s]*$")) {
				   			return true;
				   		} else {
				   			return false;
				   		}
				   	}
    




}
