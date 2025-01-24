import { useState } from 'react';

function App() {

    interface Song {
        id: number;
        songsName: string;
    }

    const [songs, setSongs] = useState<Song[]>([]);
    const [songName, setSongName] = useState('');

    const fetchSongs = async () => {
        try {
            const response = await fetch('/api/songs', {
                method: 'GET',
                headers: {
                    'Cache-Control': 'no-cache'
                }
            });
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            const data: Song[] = await response.json();
            setSongs(data);
        } catch (error) {
            console.error('Error fetching songs:', error);
        }
    };

    return (
        <>
            <h1>Song Library</h1>
            <div>
                <button onClick={fetchSongs}>Get Songs</button>
                <br/>
                <input
                    type="text"
                    value={songName}
                    onChange={(e) => setSongName(e.target.value)}
                    placeholder="Enter song name"
                />
            </div>
            <h2>Songs List:</h2>
            <ul>
                {songs.map((song) => (
                    <li key={song.id}>{song.songsName}</li>
                ))}
            </ul>
        </>
    );
}

export default App;
