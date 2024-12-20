# Data dictionnary

| Column name       | Data type | Description                          |
| ----------------- | --------- | ------------------------------------ |
| user_id           | UUID      | user identifier                      |
| first_name        | String    | user first name                      |
| last_name         | String    | user last name                       |
| pass              | String    | user pass                            |
| mail              | Mail      | user mail                            |
| role_id           | UUID      | role identifier                      |
| role_name         | String    | role name                            |
| comment_id        | UUID      | comment id                           |
| comment_body      | String    | user comment stored as a text format |
| created_at        | datetime  | creation date of the comment         |
| event_id          | UUID      | event id                             |
| event_name        | string    | event name                           |
| event_desctiption | UUID      | text describing the event            |
| starts_at         | datetime  | Event starting date and time         |
| finish_at         | datetime  | event finishing date and time        |
| location_id       | UUID      | location id                          |
| location_name     | string    | location name                        |