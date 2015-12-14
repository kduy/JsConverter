
# get people

```json
{
	"type": "Object",
	"required":[ 
		"birthday",
		"ageRange",
		"occupation",
		"gender",
		"displayName",
		"relationshipStatus",
		"language",
		"objectType",
		"aboutMe",
		"isPlusUser",
		"skills",
		"emails",
		"cover",
		"urls",
		"nickname",
		"id",
		"image",
		"kind",
		"verified",
		"plusOneCount",
		"url",
		"braggingRights",
		"placesLived",
		"domain",
		"name",
		"organizations",
		"tagline",
		"circledByCount"
	],
	"properties":{
		"birthday":{
			"type": "String",
			"tags": [
				"Birthday"
			]
		},
		"ageRange":{
			"type": "Object",
			"required":[ 
				"min",
				"max"
			],
			"properties":{
				"min":{
					"type": "Integer",
					"tags": [
						"Min"
					]
				},
				"max":{
					"type": "Integer",
					"tags": [
						"Max"
					]
				}
			}
		},
		"occupation":{
			"type": "String",
			"tags": [
				"Occupation"
			]
		},
		"gender":{
			"type": "String",
			"tags": [
				"Gender"
			]
		},
		"displayName":{
			"type": "String",
			"tags": [
				"DisplayName"
			]
		},
		"relationshipStatus":{
			"type": "String",
			"tags": [
				"RelationshipStatus"
			]
		},
		"language":{
			"type": "String",
			"tags": [
				"Language"
			]
		},
		"objectType":{
			"type": "String",
			"tags": [
				"ObjectType"
			]
		},
		"aboutMe":{
			"type": "String",
			"tags": [
				"AboutMe"
			]
		},
		"isPlusUser":{
			"type": "Boolean",
			"tags": [
				"IsPlusUser"
			]
		},
		"skills":{
			"type": "String",
			"tags": [
				"Skills"
			]
		},
		"emails":{
			"type": "Array",
			"items":{
				"type": "Object",
				"required":[ 
					"type",
					"value"
				],
				"properties":{
					"type":{
						"type": "String",
						"tags": [
							"Type"
						]
					},
					"value":{
						"type": "String",
						"tags": [
							"Value"
						]
					}
				}
			}
		},
		"cover":{
			"type": "Object",
			"required":[ 
				"layout",
				"coverPhoto",
				"coverInfo"
			],
			"properties":{
				"layout":{
					"type": "String",
					"tags": [
						"Layout"
					]
				},
				"coverPhoto":{
					"type": "Object",
					"required":[ 
						"width",
						"url",
						"height"
					],
					"properties":{
						"width":{
							"type": "Integer",
							"tags": [
								"Width"
							]
						},
						"url":{
							"type": "String",
							"tags": [
								"Url"
							]
						},
						"height":{
							"type": "Integer",
							"tags": [
								"Height"
							]
						}
					}
				},
				"coverInfo":{
					"type": "Object",
					"required":[ 
						"topImageOffset",
						"leftImageOffset"
					],
					"properties":{
						"topImageOffset":{
							"type": "Integer",
							"tags": [
								"TopImageOffset"
							]
						},
						"leftImageOffset":{
							"type": "Integer",
							"tags": [
								"LeftImageOffset"
							]
						}
					}
				}
			}
		},
		"urls":{
			"type": "Array",
			"items":{
				"type": "Object",
				"required":[ 
					"label",
					"type",
					"value"
				],
				"properties":{
					"label":{
						"type": "String",
						"tags": [
							"Label"
						]
					},
					"type":{
						"type": "String",
						"tags": [
							"Type"
						]
					},
					"value":{
						"type": "String",
						"tags": [
							"Value"
						]
					}
				}
			}
		},
		"nickname":{
			"type": "String",
			"tags": [
				"Nickname"
			]
		},
		"id":{
			"type": "String",
			"tags": [
				"Id"
			]
		},
		"image":{
			"type": "Object",
			"required":[ 
				"url"
			],
			"properties":{
				"url":{
					"type": "String",
					"tags": [
						"Url"
					]
				}
			}
		},
		"kind":{
			"type": "String",
			"tags": [
				"Kind"
			]
		},
		"verified":{
			"type": "Boolean",
			"tags": [
				"Verified"
			]
		},
		"plusOneCount":{
			"type": "Integer",
			"tags": [
				"PlusOneCount"
			]
		},
		"url":{
			"type": "String",
			"tags": [
				"Url"
			]
		},
		"braggingRights":{
			"type": "String",
			"tags": [
				"BraggingRights"
			]
		},
		"placesLived":{
			"type": "Array",
			"items":{
				"type": "Object",
				"required":[ 
					"value",
					"primary"
				],
				"properties":{
					"value":{
						"type": "String",
						"tags": [
							"Value"
						]
					},
					"primary":{
						"type": "Boolean",
						"tags": [
							"Primary"
						]
					}
				}
			}
		},
		"domain":{
			"type": "String",
			"tags": [
				"Domain"
			]
		},
		"name":{
			"type": "Object",
			"required":[ 
				"honorificSuffix",
				"formatted",
				"familyName",
				"givenName",
				"honorificPrefix",
				"middleName"
			],
			"properties":{
				"honorificSuffix":{
					"type": "String",
					"tags": [
						"HonorificSuffix"
					]
				},
				"formatted":{
					"type": "String",
					"tags": [
						"Formatted"
					]
				},
				"familyName":{
					"type": "String",
					"tags": [
						"FamilyName"
					]
				},
				"givenName":{
					"type": "String",
					"tags": [
						"GivenName"
					]
				},
				"honorificPrefix":{
					"type": "String",
					"tags": [
						"HonorificPrefix"
					]
				},
				"middleName":{
					"type": "String",
					"tags": [
						"MiddleName"
					]
				}
			}
		},
		"organizations":{
			"type": "Array",
			"items":{
				"type": "Object",
				"required":[ 
					"endDate",
					"name",
					"description",
					"location",
					"department",
					"title",
					"type",
					"startDate",
					"primary"
				],
				"properties":{
					"endDate":{
						"type": "String",
						"tags": [
							"EndDate"
						]
					},
					"name":{
						"type": "String",
						"tags": [
							"Name"
						]
					},
					"description":{
						"type": "String",
						"tags": [
							"Description"
						]
					},
					"location":{
						"type": "String",
						"tags": [
							"Location"
						]
					},
					"department":{
						"type": "String",
						"tags": [
							"Department"
						]
					},
					"title":{
						"type": "String",
						"tags": [
							"Title"
						]
					},
					"type":{
						"type": "String",
						"tags": [
							"Type"
						]
					},
					"startDate":{
						"type": "String",
						"tags": [
							"StartDate"
						]
					},
					"primary":{
						"type": "Boolean",
						"tags": [
							"Primary"
						]
					}
				}
			}
		},
		"tagline":{
			"type": "String",
			"tags": [
				"Tagline"
			]
		},
		"circledByCount":{
			"type": "Integer",
			"tags": [
				"CircledByCount"
			]
		}
	}
}

```

# search people

## query

```json
{
	"type": "Object",
	"required":[ 
		"maxResults",
		"query",
		"language",
		"pageToken"
	],
	"properties":{
		"maxResults":{
			"type": "Integer",
			"tags": [
				"MaxResults"
			]
		},
		"query":{
			"type": "String",
			"tags": [
				"Query"
			]
		},
		"language":{
			"type": "String",
			"tags": [
				"Language"
			]
		},
		"pageToken":{
			"type": "String",
			"tags": [
				"PageToken"
			]
		}
	}
}

```

## response

```json
{
	"type": "Object",
	"required":[ 
		"totalItems",
		"kind",
		"nextPageToken",
		"title",
		"items",
		"selfLink"
	],
	"properties":{
		"totalItems":{
			"type": "Integer",
			"tags": [
				"TotalItems"
			]
		},
		"kind":{
			"type": "String",
			"tags": [
				"Kind"
			]
		},
		"nextPageToken":{
			"type": "String",
			"tags": [
				"NextPageToken"
			]
		},
		"title":{
			"type": "String",
			"tags": [
				"Title"
			]
		},
		"items":{
			"type": "Array",
			"items":{
				"type": "Object",
				"required":[ 
					"birthday",
					"ageRange",
					"occupation",
					"gender",
					"displayName",
					"relationshipStatus",
					"language",
					"objectType",
					"aboutMe",
					"isPlusUser",
					"skills",
					"emails",
					"cover",
					"urls",
					"nickname",
					"id",
					"image",
					"kind",
					"verified",
					"plusOneCount",
					"url",
					"braggingRights",
					"placesLived",
					"domain",
					"name",
					"organizations",
					"tagline",
					"circledByCount"
				],
				"properties":{
					"birthday":{
						"type": "String",
						"tags": [
							"Birthday"
						]
					},
					"ageRange":{
						"type": "Object",
						"required":[ 
							"min",
							"max"
						],
						"properties":{
							"min":{
								"type": "Integer",
								"tags": [
									"Min"
								]
							},
							"max":{
								"type": "Integer",
								"tags": [
									"Max"
								]
							}
						}
					},
					"occupation":{
						"type": "String",
						"tags": [
							"Occupation"
						]
					},
					"gender":{
						"type": "String",
						"tags": [
							"Gender"
						]
					},
					"displayName":{
						"type": "String",
						"tags": [
							"DisplayName"
						]
					},
					"relationshipStatus":{
						"type": "String",
						"tags": [
							"RelationshipStatus"
						]
					},
					"language":{
						"type": "String",
						"tags": [
							"Language"
						]
					},
					"objectType":{
						"type": "String",
						"tags": [
							"ObjectType"
						]
					},
					"aboutMe":{
						"type": "String",
						"tags": [
							"AboutMe"
						]
					},
					"isPlusUser":{
						"type": "Boolean",
						"tags": [
							"IsPlusUser"
						]
					},
					"skills":{
						"type": "String",
						"tags": [
							"Skills"
						]
					},
					"emails":{
						"type": "Array",
						"items":{
							"type": "Object",
							"required":[ 
								"type",
								"value"
							],
							"properties":{
								"type":{
									"type": "String",
									"tags": [
										"Type"
									]
								},
								"value":{
									"type": "String",
									"tags": [
										"Value"
									]
								}
							}
						}
					},
					"cover":{
						"type": "Object",
						"required":[ 
							"layout",
							"coverPhoto",
							"coverInfo"
						],
						"properties":{
							"layout":{
								"type": "String",
								"tags": [
									"Layout"
								]
							},
							"coverPhoto":{
								"type": "Object",
								"required":[ 
									"width",
									"url",
									"height"
								],
								"properties":{
									"width":{
										"type": "Integer",
										"tags": [
											"Width"
										]
									},
									"url":{
										"type": "String",
										"tags": [
											"Url"
										]
									},
									"height":{
										"type": "Integer",
										"tags": [
											"Height"
										]
									}
								}
							},
							"coverInfo":{
								"type": "Object",
								"required":[ 
									"topImageOffset",
									"leftImageOffset"
								],
								"properties":{
									"topImageOffset":{
										"type": "Integer",
										"tags": [
											"TopImageOffset"
										]
									},
									"leftImageOffset":{
										"type": "Integer",
										"tags": [
											"LeftImageOffset"
										]
									}
								}
							}
						}
					},
					"urls":{
						"type": "Array",
						"items":{
							"type": "Object",
							"required":[ 
								"label",
								"type",
								"value"
							],
							"properties":{
								"label":{
									"type": "String",
									"tags": [
										"Label"
									]
								},
								"type":{
									"type": "String",
									"tags": [
										"Type"
									]
								},
								"value":{
									"type": "String",
									"tags": [
										"Value"
									]
								}
							}
						}
					},
					"nickname":{
						"type": "String",
						"tags": [
							"Nickname"
						]
					},
					"id":{
						"type": "String",
						"tags": [
							"Id"
						]
					},
					"image":{
						"type": "Object",
						"required":[ 
							"url"
						],
						"properties":{
							"url":{
								"type": "String",
								"tags": [
									"Url"
								]
							}
						}
					},
					"kind":{
						"type": "String",
						"tags": [
							"Kind"
						]
					},
					"verified":{
						"type": "Boolean",
						"tags": [
							"Verified"
						]
					},
					"plusOneCount":{
						"type": "Integer",
						"tags": [
							"PlusOneCount"
						]
					},
					"url":{
						"type": "String",
						"tags": [
							"Url"
						]
					},
					"braggingRights":{
						"type": "String",
						"tags": [
							"BraggingRights"
						]
					},
					"placesLived":{
						"type": "Array",
						"items":{
							"type": "Object",
							"required":[ 
								"value",
								"primary"
							],
							"properties":{
								"value":{
									"type": "String",
									"tags": [
										"Value"
									]
								},
								"primary":{
									"type": "Boolean",
									"tags": [
										"Primary"
									]
								}
							}
						}
					},
					"domain":{
						"type": "String",
						"tags": [
							"Domain"
						]
					},
					"name":{
						"type": "Object",
						"required":[ 
							"honorificSuffix",
							"formatted",
							"familyName",
							"givenName",
							"honorificPrefix",
							"middleName"
						],
						"properties":{
							"honorificSuffix":{
								"type": "String",
								"tags": [
									"HonorificSuffix"
								]
							},
							"formatted":{
								"type": "String",
								"tags": [
									"Formatted"
								]
							},
							"familyName":{
								"type": "String",
								"tags": [
									"FamilyName"
								]
							},
							"givenName":{
								"type": "String",
								"tags": [
									"GivenName"
								]
							},
							"honorificPrefix":{
								"type": "String",
								"tags": [
									"HonorificPrefix"
								]
							},
							"middleName":{
								"type": "String",
								"tags": [
									"MiddleName"
								]
							}
						}
					},
					"organizations":{
						"type": "Array",
						"items":{
							"type": "Object",
							"required":[ 
								"endDate",
								"name",
								"description",
								"location",
								"department",
								"title",
								"type",
								"startDate",
								"primary"
							],
							"properties":{
								"endDate":{
									"type": "String",
									"tags": [
										"EndDate"
									]
								},
								"name":{
									"type": "String",
									"tags": [
										"Name"
									]
								},
								"description":{
									"type": "String",
									"tags": [
										"Description"
									]
								},
								"location":{
									"type": "String",
									"tags": [
										"Location"
									]
								},
								"department":{
									"type": "String",
									"tags": [
										"Department"
									]
								},
								"title":{
									"type": "String",
									"tags": [
										"Title"
									]
								},
								"type":{
									"type": "String",
									"tags": [
										"Type"
									]
								},
								"startDate":{
									"type": "String",
									"tags": [
										"StartDate"
									]
								},
								"primary":{
									"type": "Boolean",
									"tags": [
										"Primary"
									]
								}
							}
						}
					},
					"tagline":{
						"type": "String",
						"tags": [
							"Tagline"
						]
					},
					"circledByCount":{
						"type": "Integer",
						"tags": [
							"CircledByCount"
						]
					}
				}
			}
		},
		"selfLink":{
			"type": "String",
			"tags": [
				"SelfLink"
			]
		}
	}
}

```

# people list

## response

```json
{
	"type": "Object",
	"required":[ 
		"totalItems",
		"kind",
		"nextPageToken",
		"title",
		"items",
		"selfLink"
	],
	"properties":{
		"totalItems":{
			"type": "Integer",
			"tags": [
				"TotalItems"
			]
		},
		"kind":{
			"type": "String",
			"tags": [
				"Kind"
			]
		},
		"nextPageToken":{
			"type": "String",
			"tags": [
				"NextPageToken"
			]
		},
		"title":{
			"type": "String",
			"tags": [
				"Title"
			]
		},
		"items":{
			"type": "Array",
			"items":{
				"type": "String",
				"tags": [
					""
				]
			}
		},
		"selfLink":{
			"type": "String",
			"tags": [
				"SelfLink"
			]
		}
	}
}

```
