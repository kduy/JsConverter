# get people

```json
{
  "kind": "plusperson",
  "nickname": "string",
  "occupation": "string",
  "skills": "string",
  "birthday": "string",
  "gender": "string",
  "emails": [
    {
      "value": "string",
      "type": "string"
    }
  ],
  "urls": [
    {
      "value": "string",
      "type": "string",
      "label": "string"
    }
  ],
  "objectType": "string",
  "id": "string",
  "displayName": "string",
  "name": {
    "formatted": "string",
    "familyName": "string",
    "givenName": "string",
    "middleName": "string",
    "honorificPrefix": "string",
    "honorificSuffix": "string"
  },
  "tagline": "string",
  "braggingRights": "string",
  "aboutMe": "string",
  "relationshipStatus": "string",
  "url": "string",
  "image": {
    "url": "string",

  },
  "organizations": [
    {
      "name": "string",
      "department": "string",
      "title": "string",
      "type": "string",
      "startDate": "string",
      "endDate": "string",
      "location": "string",
      "description": "string",
      "primary": true
    }
  ],
  "placesLived": [
    {
      "value": "string",
      "primary": true
    }
  ],
  "isPlusUser": true,
  "language": "string",
  "ageRange": {
    "min": 1,
    "max": 1
  },
  "plusOneCount": 1,
  "circledByCount": 1,
  "verified": true,
  "cover": {
    "layout": "string",
    "coverPhoto": {
      "url": "string",
      "height": 1,
      "width": 1
    },
    "coverInfo": {
      "topImageOffset": 1,
      "leftImageOffset": 1
    }
  },
  "domain": "string"
}
```

# search people
## query
```json
{
  "query": "query",
  "language": "language",
  "maxResults": 10,
  "pageToken": "pageToken"
}
```

## response
```json
{
  "kind": "pluspeopleFeed",
  "selfLink": "selfLink",
  "title": "title",
  "nextPageToken": "nextPageToken",
  "totalItems": 1,
  "items": [
    {
      "kind": "plusperson",
      "nickname": "string",
      "occupation": "string",
      "skills": "string",
      "birthday": "string",
      "gender": "string",
      "emails": [
        {
          "value": "string",
          "type": "string"
        }
      ],
      "urls": [
        {
          "value": "string",
          "type": "string",
          "label": "string"
        }
      ],
      "objectType": "string",
      "id": "string",
      "displayName": "string",
      "name": {
        "formatted": "string",
        "familyName": "string",
        "givenName": "string",
        "middleName": "string",
        "honorificPrefix": "string",
        "honorificSuffix": "string"
      },
      "tagline": "string",
      "braggingRights": "string",
      "aboutMe": "string",
      "relationshipStatus": "string",
      "url": "string",
      "image": {
        "url": "string",

      },
      "organizations": [
        {
          "name": "string",
          "department": "string",
          "title": "string",
          "type": "string",
          "startDate": "string",
          "endDate": "string",
          "location": "string",
          "description": "string",
          "primary": true
        }
      ],
      "placesLived": [
        {
          "value": "string",
          "primary": true
        }
      ],
      "isPlusUser": true,
      "language": "string",
      "ageRange": {
        "min": 1,
        "max": 1
      },
      "plusOneCount": 1,
      "circledByCount": 1,
      "verified": true,
      "cover": {
        "layout": "string",
        "coverPhoto": {
          "url": "string",
          "height": 1,
          "width": 1
        },
        "coverInfo": {
          "topImageOffset": 1,
          "leftImageOffset": 1
        }
      },
      "domain": "string"
    }
  ]
}
```

# people list

## response
```json
  {
    "kind": "kind",
    "selfLink": "string",
    "title": "string",
    "nextPageToken": "string",
    "totalItems": 1,
    "items": [
      "people"
    ]
}
```
