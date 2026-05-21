# English Janala – Smart English Learning Dictionary

English Janala is a MERN stack web application designed to help users improve their English vocabulary by searching English words and finding their Bangla meanings, synonyms, pronunciations, and example sentences.

---

# Features

## User Features
- Search English words
- View Bangla meanings
- View synonyms
- Real-time search suggestions
- Partial and exact search
- Spell correction suggestions
- Save favorite words
- View search history
- Share words
- Responsive UI for mobile and desktop

## Admin Features
- Add new words
- Edit word meanings
- Delete words
- Manage users
- View reports and statistics

---

# Future Features
- AI Chatbot
- Voice Search
- Sentence Generator
- Grammar Checker
- Audio Pronunciation

---

# Tech Stack

## Frontend
- React.js
- React Router
- Axios
- Tailwind CSS / CSS

## Backend
- Node.js
- Express.js

## Database
- MongoDB

## Authentication
- JWT Authentication
- bcrypt password hashing

---


# Entity relationship (re) diagram


# Project Structure

```bash
English-Janala/
│
├── client/                 # Frontend (React)
│   ├── src/
│   ├── public/
│   └── package.json
│
├── server/                 # Backend (Node + Express)
│   ├── controllers/
│   ├── routes/
│   ├── models/
│   ├── middleware/
│   └── server.js
│
├── README.md
└── package.json
# Functional Requirements

## User Functional Requirements

### FR-1 User Registration
- Users must be able to create an account using email and password.

### FR-2 User Login
- Users must be able to log into the system securely.

### FR-3 Word Search
- Users must be able to search English words.

### FR-4 Exact Search
- The system must support exact keyword search.

### FR-5 Partial Search
- The system must support partial keyword matching.

### FR-6 Real-Time Search
- The system must provide real-time search suggestions while typing.

### FR-7 Spell Correction
- The system should suggest correct spellings for invalid words.

### FR-8 View Word Details
The system must display:
- Bangla meaning
- Synonyms
- Pronunciation
- Example sentence
- Word type

### FR-9 Save Favorite Words
- Registered users must be able to save favorite words.

### FR-10 Remove Favorite Words
- Users must be able to remove saved favorite words.

### FR-11 Search History
- The system must store and display user search history.

### FR-12 Share Words
- Users must be able to copy or share words.

### FR-13 Responsive Design
- The application must support mobile and desktop devices.

---

# User Use Cases

## Use Case 1: Search a Word

### Actor
Guest User / Registered User

### Description
A user searches for an English word to learn its Bangla meaning and related information.

### Main Flow
1. User enters an English word in the search box
2. System validates the input
3. System searches the database
4. System displays:
   - Bangla meaning
   - Synonyms
   - Pronunciation
   - Example sentence
5. User may save or share the word

### Alternative Flow
- If the word is not found, the system shows:
  - “Word not found”
  - Suggested similar words

---

## Use Case 2: Save Favorite Word

### Actor
Registered User

### Description
A logged-in user saves a word into the favorite list.

### Main Flow
1. User logs into the system
2. User searches for a word
3. User clicks the “Add to Favorites” button
4. System stores the word in the Favorites collection
5. Success message is displayed

---

## Use Case 3: View Search History

### Actor
Registered User

### Description
Users can view previously searched words.

### Main Flow
1. User logs into the system
2. User navigates to Search History page
3. System retrieves previous search records
4. System displays the history list

---

## Use Case 4: User Login

### Actor
Registered User

### Description
Users authenticate themselves to access personalized features.

### Main Flow
1. User enters email and password
2. System validates credentials
3. System authenticates the user
4. User is redirected to dashboard/homepage

### Alternative Flow
- Invalid email/password shows an error message

---

## Use Case 5: Share a Word

### Actor
Guest User / Registered User

### Description
Users can share dictionary words with others.

### Main Flow
1. User searches for a word
2. User clicks the Share button
3. System generates a shareable link or copies text
4. User shares the word successfully
